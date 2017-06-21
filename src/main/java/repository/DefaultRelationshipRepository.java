package repository;

import io.katharsis.core.internal.utils.MultivaluedMap;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.BulkRelationshipRepositoryV2;
import io.katharsis.resource.list.ResourceList;

import java.io.Serializable;

public class DefaultRelationshipRepository implements BulkRelationshipRepositoryV2 {


    public MultivaluedMap findTargets(Iterable iterable, String s, QuerySpec querySpec) {
        return null;
    }

    public Class getSourceResourceClass() {
        return null;
    }

    public Class getTargetResourceClass() {
        return null;
    }

    public void setRelation(Object o, Serializable serializable, String s) {

    }

    public void setRelations(Object o, Iterable iterable, String s) {

    }

    public void addRelations(Object o, Iterable iterable, String s) {

    }

    public void removeRelations(Object o, Iterable iterable, String s) {

    }

    public Object findOneTarget(Serializable serializable, String s, QuerySpec querySpec) {
        return null;
    }

    public ResourceList findManyTargets(Serializable serializable, String s, QuerySpec querySpec) {
        return null;
    }
}
