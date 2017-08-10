package defaults;

import io.katharsis.resource.annotations.JsonApiId;

public class DefaultTable {
    @JsonApiId
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
