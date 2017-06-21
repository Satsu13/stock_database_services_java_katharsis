package database;

import io.katharsis.resource.annotations.JsonApiId;

public class BaseTable {
    @JsonApiId
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
