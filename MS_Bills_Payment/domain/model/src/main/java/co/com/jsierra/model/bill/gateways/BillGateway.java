package co.com.jsierra.model.bill.gateways;

import co.com.jsierra.model.bill.Bill;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BillGateway {
    Flux<Bill> getAllBillsAvailable();

    Mono<Bill> getBillById();
}
