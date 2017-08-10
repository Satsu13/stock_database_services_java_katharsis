package resources.stock_data;

import resources.BaseTable;
import io.katharsis.resource.annotations.JsonApiRelation;
import io.katharsis.resource.annotations.JsonApiResource;
import io.katharsis.resource.annotations.LookupIncludeBehavior;
import io.katharsis.resource.annotations.SerializeType;

import java.util.List;

@JsonApiResource(type = "stock-histories")
public class StockHistory extends BaseTable {
    private String ticker;

    @JsonApiRelation(lookUp = LookupIncludeBehavior.AUTOMATICALLY_WHEN_NULL, serialize = SerializeType.EAGER)
    private List<StockDay> stockDays;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public List<StockDay> getStockDays() {
        return stockDays;
    }

    public void setStockDays(List<StockDay> stockDays) {
        this.stockDays = stockDays;
    }
}
