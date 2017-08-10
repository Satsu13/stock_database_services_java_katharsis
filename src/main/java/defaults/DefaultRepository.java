package defaults;

import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.ResourceList;

public class DefaultRepository<T> extends ResourceRepositoryBase<T, String> {
    protected DefaultRepository(Class<T> resourceClass) {
        super(resourceClass);
    }

    @Override
    public <S extends T> S save(S resource) {
        return super.save(resource);
    }

    @Override
    public void delete(String id) {
        super.delete(id);
    }

    public ResourceList<T> findAll(QuerySpec querySpec) {
        return null;
    }
}
