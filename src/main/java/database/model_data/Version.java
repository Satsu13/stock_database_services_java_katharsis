package database.model_data;

import database.BaseTable;
import io.katharsis.resource.annotations.JsonApiResource;

@JsonApiResource(type = "versions")
public class Version extends BaseTable {
}
