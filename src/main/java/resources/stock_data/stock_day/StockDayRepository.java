package resources.stock_data.stock_day;

import defaults.DefaultRepository;

public class StockDayRepository extends DefaultRepository<StockDay> {
    protected StockDayRepository(Class<StockDay> resourceClass) {
        super(resourceClass);
    }
}
