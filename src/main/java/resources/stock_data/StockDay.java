package resources.stock_data;

import resources.BaseTable;
import io.katharsis.resource.annotations.JsonApiRelation;
import io.katharsis.resource.annotations.JsonApiResource;
import io.katharsis.resource.annotations.LookupIncludeBehavior;
import io.katharsis.resource.annotations.SerializeType;

@JsonApiResource(type = "stock-days")
public class StockDay extends BaseTable {
    private Double value;
    private String date;

    @JsonApiRelation(lookUp = LookupIncludeBehavior.AUTOMATICALLY_WHEN_NULL, serialize = SerializeType.EAGER)
    private StockHistory stockHistory;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public StockHistory getStockHistory() {
        return stockHistory;
    }

    public void setStockHistory(StockHistory stockHistory) {
        this.stockHistory = stockHistory;
    }
}
