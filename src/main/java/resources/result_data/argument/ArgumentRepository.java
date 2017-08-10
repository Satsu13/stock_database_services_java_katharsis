package resources.result_data.argument;

import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryV2;
import io.katharsis.resource.list.ResourceList;

import java.io.Serializable;

public class ArgumentRepository implements ResourceRepositoryV2 {
    public Class getResourceClass() {
        return null;
    }

    public Object findOne(Serializable serializable, QuerySpec querySpec) {
        return null;
    }

    public ResourceList findAll(QuerySpec querySpec) {
        return null;
    }

    public ResourceList findAll(Iterable iterable, QuerySpec querySpec) {
        return null;
    }

    public void delete(Serializable serializable) {

    }

    public Object create(Object o) {
        return null;
    }

    public Object save(Object o) {
        return null;
    }
}
