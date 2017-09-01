package defaults;

import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.ResourceList;

import java.util.HashMap;
import java.util.Map;

public class DefaultRepository<T extends DefaultTable> extends ResourceRepositoryBase<T, Long> {
    private Map<Long, T> repository;

    protected DefaultRepository(Class<T> resourceClass) {
        super(resourceClass);
        repository = new HashMap<Long, T>();
    }

    @Override
    public <S extends T> S save(S resource) {
        repository.put(resource.getId(), resource);
        return resource;
    }

    @Override
    public void delete(Long id) {
        repository.remove(id);
    }

    public ResourceList<T> findAll(QuerySpec querySpec) {
        return querySpec.apply(repository.values());
    }
}
