package resources.stock_data.stock_history;

import io.katharsis.repository.RelationshipRepositoryBase;
import resources.stock_data.stock_day.StockDay;

public class StockHistoryStockDayRelationshipRepository
        extends RelationshipRepositoryBase<StockHistory, Long, StockDay, Long> {

    protected StockHistoryStockDayRelationshipRepository(
            Class<StockHistory> sourceResourceClass,
            Class<StockDay> targetResourceClass) {
        super(sourceResourceClass, targetResourceClass);
    }
}
