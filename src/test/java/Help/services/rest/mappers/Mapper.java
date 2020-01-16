package Help.services.rest.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wc.walter.qa.common.services.rest.RestService;
import com.wc.walter.qa.common.utils.helpers.FileHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    public static <T> List<T> getListOfObject(RestService restService, List<String> classNameList) throws IOException {
        List<Object> retrivedObjects = new ArrayList<Object>();
        for (int i = 0; i < classNameList.size(); i++) {
            retrivedObjects.add(getRetrivedObject(restService, getParticularClass(classNameList.get(i))));
        }
        return (List<T>) retrivedObjects;
    }

    private static <T> Class<T> getParticularClass(String className) {
        final String rootPackageName = "com.wc.walter.qa.common.services.rest.dto";
        return FileHelper.getParticularClassWithPackage(rootPackageName, className);
    }

    private static <T> T getRetrivedObject(RestService restService, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(restService.getResponse().asString(), clazz);
    }
}
