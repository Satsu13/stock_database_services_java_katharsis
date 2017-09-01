package resources;

import io.katharsis.client.KatharsisClient;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryV2;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.function.Supplier;

import static org.junit.Assert.assertNotNull;

@Ignore
public abstract class ResourceTest<T> {
    private List<T> resources;

    @Before
    public void setUp() throws Exception {
        KatharsisClient client = new KatharsisClient("http://192.168.99.100:3000/");

        Class<T> resourceClass = getResourceClass();
        ResourceRepositoryV2<T, Long> repo = client.getRepositoryForType(resourceClass);
        QuerySpec querySpec = new QuerySpec(resourceClass);

        resources = repo.findAll(querySpec);
    }

    protected abstract Class<T> getResourceClass();

    @Test
    public void testNotNullRelationships() throws Exception {
        for (T resource : resources) {
            List<Supplier> relationships = getNotNullRelationships(resource);
            assertResultsNotNull(relationships);
        }
    }

    protected abstract List<Supplier> getNotNullRelationships(T resource);

    @Test
    public void testData() throws Exception {
        for (T resource : resources) {
            List<Supplier> data = getNotNullData(resource);
            assertResultsNotNull(data);
        }
    }

    protected abstract List<Supplier> getNotNullData(T resource);

    private void assertResultsNotNull(List<Supplier> suppliers) {
        for (Supplier supplier : suppliers) {
            Object result = supplier.get();
            assertNotNull(result);
        }
    }
}
