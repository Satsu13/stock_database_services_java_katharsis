package resources.stock_data.stock_history;

import defaults.DefaultRepository;

public class StockHistoryRepository extends DefaultRepository<StockHistory> {
    protected StockHistoryRepository(Class<StockHistory> resourceClass) {
        super(resourceClass);
    }
}
