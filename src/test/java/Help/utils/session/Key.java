package Help.utils.session;

import lombok.Getter;

@Getter
public class Key {

    private final String text;

    private Key(final String text) {
        this.text = text;
    }

    public static String getCanonicalName(Object object) {
        return object.getClass().getCanonicalName();
    }

    @Override
    public String toString() {
        return text;
    }

    public enum Keys {

        //Test results

        COUNT("count"),
        PASSED_TESTS("passed_tests"),
        FAILED_TESTS("failed_tests"),

        //JWT Session Token
        JWT_TOKEN("jwt_token");

        private final String text;

        private Keys(final String text) {
            this.text = text;
        }
    }

}
