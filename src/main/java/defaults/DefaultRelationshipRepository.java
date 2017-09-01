package defaults;

import io.katharsis.repository.RelationshipRepositoryBase;

public class DefaultRelationshipRepository<T, D> extends RelationshipRepositoryBase<T, Long, D, Long> {
    protected DefaultRelationshipRepository(Class<T> sourceResourceClass, Class<D> targetResourceClass) {
        super(sourceResourceClass, targetResourceClass);
    }
}
