package resources.stock_data.stock_history;

import io.katharsis.client.KatharsisClient;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryV2;
import org.junit.Test;
import resources.stock_data.stock_day.StockDay;

import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class StockHistoryTest {
    @Test
    public void testName() throws Exception {
        KatharsisClient client = new KatharsisClient("http://192.168.99.100:3000/");
        ResourceRepositoryV2<StockHistory, Long> repo = client.getRepositoryForType(StockHistory.class);
        QuerySpec querySpec = new QuerySpec(StockDay.class);
        List<StockHistory> histories = repo.findAll(querySpec);
        assertNotEquals(0, histories.size());
    }
}