package resources.stock_data.stock_day;

import io.katharsis.client.KatharsisClient;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryV2;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class StockDayTest {

    @Test
    public void testName() throws Exception {
        KatharsisClient client = new KatharsisClient("http://192.168.99.100:3000/");
        ResourceRepositoryV2<StockDay, Long> repo = client.getRepositoryForType(StockDay.class);
        QuerySpec querySpec = new QuerySpec(StockDay.class);
        List<StockDay> days = repo.findAll(querySpec);
        assertNotEquals(0, days.size());
    }
}