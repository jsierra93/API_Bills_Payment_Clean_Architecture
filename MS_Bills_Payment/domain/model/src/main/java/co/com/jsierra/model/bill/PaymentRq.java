package co.com.jsierra.model.bill;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
public class PaymentRq {
    private UUID tracker;
    private String numBill;
    private Date datePayment;
    private BigDecimal amountPayment;
    private String codProvider;
    private String codClient;
    private BigDecimal cost;
    private String channel;
}
