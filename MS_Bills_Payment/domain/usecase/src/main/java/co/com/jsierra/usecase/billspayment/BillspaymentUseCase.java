package co.com.jsierra.usecase.billspayment;

import co.com.jsierra.model.bill.Bill;
import co.com.jsierra.model.bill.Cost;
import co.com.jsierra.model.bill.PaymentRq;
import co.com.jsierra.model.bill.PaymentRs;
import co.com.jsierra.model.bill.gateways.BillGateway;
import co.com.jsierra.model.bill.gateways.CostGateway;
import co.com.jsierra.model.bill.gateways.LogsGateway;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class BillspaymentUseCase {

    private final BillGateway billGateway;
    private final CostGateway costGateway;
    private final LogsGateway logsGateway;

    public Flux<Bill> getBillsAvailable() {
    /*
        Consultar todas las facturas
        Filtrar facturas disponibles
     */
        return billGateway.getAllBills();
    }


    public Mono<Bill> getBillById(String id) {
    /*
        Consultar factura por id
     */
        return billGateway.getBillById();
    }


    public Mono<PaymentRs> paymentBills(PaymentRq paymentRq) {
    /*
        Consultar costo por proveedor
        Agregar costo al request
        Enviar a BD y generar response
     */
        return Mono.just(PaymentRs.builder().build());
    }
}
