package pack2;

import java.util.HashMap;
import java.util.Map;

// final so not extendable
public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Map<String, String> metadata;

    public ImmutableClass(int id, String name, Map<String, String> metadata) {
        this.id = id;
        this.name = name;

        // perform deep copy of objects, never store references
        this.metadata = new HashMap<>();
        metadata.keySet().forEach(key -> {
            this.metadata.put(key, metadata.get(key));
        });
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    // return deep copy of object to avoid access to internal state
    public Map<String, String> getMetadata() {
        Map<String, String> copy = new HashMap<>();
        this.metadata.keySet().forEach(key -> {
            copy.put(key, this.metadata.get(key));
        });
        return copy;
    }
}


