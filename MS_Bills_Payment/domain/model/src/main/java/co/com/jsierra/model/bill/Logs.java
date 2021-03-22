package co.com.jsierra.model.bill;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder(toBuilder = true)
public class Logs {
    private String service;
    private Date dateTransaction;
    private String transaction;
    private String channel;
    private String dataRequest;
    private String dataResponse;
    private boolean statusTransaction;

}
