package Help.utils.session;

import java.util.Map;

public class Session {

    private static final ThreadLocal<TestSessionVariables> testSessionThreadLocal = new ThreadLocal();

    public static Map<Object, Object> getCurrentSession() {
        if (testSessionThreadLocal.get() == null) {
            testSessionThreadLocal.set(new TestSessionVariables());
        }
        return (Map) testSessionThreadLocal.get();
    }
}