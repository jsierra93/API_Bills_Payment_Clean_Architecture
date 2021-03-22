package co.com.jsierra.model.bill;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder(toBuilder = true)
public class Bill {
    private String numBill;
    private Date dateBill;
    private String detailBill;
    private BigDecimal amountBill;
    private String codProveedor;
    private String codClient;
    private BigDecimal cost;
    private boolean state;
}
