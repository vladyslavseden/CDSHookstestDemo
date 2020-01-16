package Help.utils.session;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestSessionVariables<K, V> extends ConcurrentHashMap implements Map {
    private final Map<String, String> metadata = new ConcurrentHashMap();

    public TestSessionVariables() {
    }

    public void shouldContainKey(Object key) {
        Object result = super.get(key);
        if (result == null) {
            throw new AssertionError("Session variable " + key + " expected but not found.");
        }
    }

    public Object put(Object key, Object value) {
        return value == null ? this.remove(key) : super.put(key, value);
    }

    public Map<String, String> getMetaData() {
        return ImmutableMap.copyOf(this.metadata);
    }

    public void addMetaData(String key, String value) {
        this.metadata.put(key, value);
    }

    public void clearMetaData() {
        this.metadata.clear();
    }

    public void clear() {
        this.clearMetaData();
        super.clear();
    }
}