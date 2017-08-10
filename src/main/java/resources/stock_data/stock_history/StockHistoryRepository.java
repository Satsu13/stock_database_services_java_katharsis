package resources.stock_data.stock_history;

import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.ResourceList;

public class StockHistoryRepository extends ResourceRepositoryBase<StockHistory, String> {
    protected StockHistoryRepository(Class<StockHistory> resourceClass) {
        super(resourceClass);
    }

    @Override
    public <S extends StockHistory> S save(S resource) {
        return super.save(resource);
    }

    @Override
    public void delete(String id) {
        super.delete(id);
    }

    public ResourceList<StockHistory> findAll(QuerySpec querySpec) {
        return null;
    }
}
