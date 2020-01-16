package Help.utils.helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

public class FileHelper {

    private static final String CLASS_FILE_EXTENSION = ".class";

    public static <T> Class<T> getParticularClassWithPackage(final String packageName, final String classname) {
        try {
            return getClassInPackage(packageName, classname);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File is not found ", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Class is not found", e);
        }
    }

    /**
     * Scans all classes accessible from the context class loader which belong to the given package and subpackages.
     *
     * @param packageName The base package
     * @return The classes
     * @throws ClassNotFoundException
     * @throws IOException
     */
    private static Class[] getClasses(String packageName)
            throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        assert classLoader != null;
        String path = packageName.replace('.', '/');
        Enumeration resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList();
        while (resources.hasMoreElements()) {
            URL resource = (URL) resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList classes = new ArrayList();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return (Class[]) classes.toArray(new Class[classes.size()]);
    }

    /**
     * Recursive method used to find all classes in a given directory and subdirs.
     *
     * @param directory   The base directory
     * @param packageName The package name for classes found inside the base directory
     * @return The classes
     * @throws ClassNotFoundException
     */
    private static List findClasses(File directory, String packageName) throws ClassNotFoundException {
        List classes = new ArrayList();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }

    /**
     * https://www.atlassian.com/blog/archives/reflecting_on_the_impossible
     * Returns a collection of all Classes inside the given package and subpackages.
     * Note that this method relies on the classes living in class files (not jars) in a single directory.
     *
     * @param packageName Fully qualified name of the package; eg "com.example.foo"
     * @return a collection of all Classes inside the given package and subpackages.
     * @throws FileNotFoundException if the package name is invalid.
     */
    private static Collection getClassesInPackage(String packageName) throws
            FileNotFoundException {
// We expect to find the classes in a file system directory with a name
// corresponding to the package name.
        String directoryName = packageName.replace('.', '/');
// Try to find this directory on the class path -
//  Note we only expect one such directory.
        URL urlPackageDirectory = ClassLoader.getSystemClassLoader().getResource(directoryName);
        if (urlPackageDirectory == null) {
            throw new FileNotFoundException("Could not find directory '" +
                    directoryName + "' on the classpath.");
        }
        File directory = new File(urlPackageDirectory.getFile());
        ArrayList classes = new ArrayList();
// Find all class files in this directory and sub-directories.
        getClassesRecursively(packageName, directory, classes);
        return classes;
    }

    /**
     * Updates the given class list with class files in the given file-system
     * directory and sub directories.
     *
     * @param packageName The package name corresponding to the given directory.
     * @param directory   The directory to extract class files from.
     * @param classList   The list of classes found. This is appended to recursively.
     */
    private static void getClassesRecursively(String packageName, File directory,
                                              Collection classList) {
// Loop over the contents of this directory:
        File[] childFiles = directory.listFiles();
        for (int i = 0; i < childFiles.length; i++) {
            File childFile = childFiles[i];
            if (childFile.isFile()) {
                String fileName = childFile.getName();
// We only want the .class files.
                if (fileName.endsWith(CLASS_FILE_EXTENSION)) {
// Remove the .class extension to get the class name.
                    String className = fileName.substring(0, fileName.length() -
                            CLASS_FILE_EXTENSION.length());
                    try {
                        classList.add(Class.forName(packageName + '.' + className));
                    } catch (ClassNotFoundException ex) {
// This shouldn't happen since we are finding classes in a
//  directory on our classpath.
                        throw new RuntimeException(ex);
                    }
                }
            } else if (childFile.isDirectory()) {
// Recurse into this subdirectory
                getClassesRecursively(packageName + '.' + childFile.getName(),
                        childFile, classList);
            }
        }
    }


    /**
     * //https://www.atlassian.com/blog/archives/reflecting_on_the_impossible
     * Returns a collection of all Classes inside the given package and subpackages.
     * Note that this method relies on the classes living in class files (not jars) in a single directory.
     *
     * @param packageName Fully qualified name of the package; eg "com.example.foo"
     * @return a collection of all Classes inside the given package and subpackages.
     * @throws FileNotFoundException if the package name is invalid.
     */
    private static Class getClassInPackage(String packageName, String className) throws
            FileNotFoundException, ClassNotFoundException {
// We expect to find the classes in a file system directory with a name
// corresponding to the package name.
        String directoryName = packageName.replace('.', '/');
// Try to find this directory on the class path -
//  Note we only expect one such directory.
        URL urlPackageDirectory = ClassLoader.getSystemClassLoader().getResource(directoryName);
        if (urlPackageDirectory == null) {
            throw new FileNotFoundException("Could not find directory '" +
                    directoryName + "' on the classpath.");
        }
        File directory = new File(urlPackageDirectory.getFile());
        ArrayList<Class> classes = new ArrayList<>();
        Class clazz = null;
// Find all class files in this directory and sub-directories.
        getClassRecursively(packageName, directory, className, classes);
        if (classes.size() > 0) {
            clazz = classes.get(0);
            if (clazz == null) {
                throw new ClassNotFoundException("Class is not found by name: " + className);
            }
        } else {
            throw new ClassNotFoundException("Class is not found by name: " + className);
        }

        return clazz;
    }

    /**
     * Updates the given class list with class files in the given file-system
     * directory and sub directories.
     *
     * @param packageName     The package name corresponding to the given directory.
     * @param directory       The directory to extract class files from.
     * @param sourceClassName The class name source. This is particular class.
     */
    private static void getClassRecursively(String packageName, File directory,
                                            String sourceClassName, Collection classList) {
// Loop over the contents of this directory:
        File[] childFiles = directory.listFiles();
        for (int i = 0; i < childFiles.length; i++) {
            File childFile = childFiles[i];
            if (childFile.isFile()) {
                String fileName = childFile.getName();
// We only want the .class files.
                if (fileName.endsWith(CLASS_FILE_EXTENSION)) {
// Remove the .class extension to get the class name.
                    String clazzName = fileName.substring(0, fileName.length() -
                            CLASS_FILE_EXTENSION.length());
                    try {
                        if (clazzName.equals(sourceClassName)) {
                            classList.add(Class.forName(packageName + '.' + clazzName));
                        }
                    } catch (ClassNotFoundException ex) {
// This shouldn't happen since we are finding classes in a
//  directory on our classpath.
                        throw new RuntimeException(ex);
                    }
                }
            } else if (childFile.isDirectory()) {
// Recurse into this subdirectory
                getClassRecursively(packageName + '.' + childFile.getName(),
                        childFile, sourceClassName, classList);
            }
        }
    }
}
