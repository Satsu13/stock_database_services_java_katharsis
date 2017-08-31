package resources.stock_data.stock_history;

import io.katharsis.client.KatharsisClient;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryV2;
import org.junit.Test;
import resources.ResourceTest;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.Assert.assertNotEquals;

public class StockHistoryTest extends ResourceTest<StockHistory> {
    @Test
    public void testName() throws Exception {
        KatharsisClient client = new KatharsisClient("http://192.168.99.100:3000/");
        ResourceRepositoryV2<StockHistory, Long> repo = client.getRepositoryForType(StockHistory.class);
        QuerySpec querySpec = new QuerySpec(StockHistory.class);
        List<StockHistory> histories = repo.findAll(querySpec);
        assertNotEquals(0, histories.size());
    }

    @Override
    protected Class<StockHistory> getResourceClass() {
        return StockHistory.class;
    }

    @Override
    protected List<Supplier> getRelationships(StockHistory resource) {
        return Collections.singletonList(
                resource::getStockDays
        );
    }
}