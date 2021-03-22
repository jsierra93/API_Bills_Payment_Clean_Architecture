package co.com.jsierra.model.bill;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Cost {
    private String codProvider;
    private BigDecimal cost;
}
