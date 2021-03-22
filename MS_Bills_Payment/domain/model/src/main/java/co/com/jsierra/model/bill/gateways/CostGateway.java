package co.com.jsierra.model.bill.gateways;

import co.com.jsierra.model.bill.Cost;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CostGateway {
    Mono<Cost> getCostByProvider();
    Flux<Cost> getAllCost();
}
