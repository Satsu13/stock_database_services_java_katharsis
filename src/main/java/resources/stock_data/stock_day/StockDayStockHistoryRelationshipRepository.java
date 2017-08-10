package resources.stock_data.stock_day;

import io.katharsis.repository.RelationshipRepositoryBase;
import resources.stock_data.stock_history.StockHistory;

public class StockDayStockHistoryRelationshipRepository
        extends RelationshipRepositoryBase<StockDay, Long, StockHistory, Long> {

    protected StockDayStockHistoryRelationshipRepository(
            Class<StockDay> sourceResourceClass,
            Class<StockHistory> targetResourceClass) {
        super(sourceResourceClass, targetResourceClass);
    }
}
