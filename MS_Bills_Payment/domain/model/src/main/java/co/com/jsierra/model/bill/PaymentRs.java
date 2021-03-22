package co.com.jsierra.model.bill;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
public class PaymentRs {
    private UUID idPayment;
    private UUID tracker;
    private String numBill;
    private Date datePayment;
    private BigDecimal amountPayment;
    private boolean statusPayment;
}
