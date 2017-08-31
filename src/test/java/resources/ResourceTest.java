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
    public void testRelationships() throws Exception {
        for (T resource : resources) {
            testRelationshipsOnResource(resource);
        }
    }

    private void testRelationshipsOnResource(T resource) {
        List<Supplier> relationships = getRelationships(resource);

        for (Supplier relationship : relationships) {
            Object manifestation = relationship.get();
            assertNotNull(manifestation);
        }
    }

    protected abstract List<Supplier> getRelationships(T resource);
}
