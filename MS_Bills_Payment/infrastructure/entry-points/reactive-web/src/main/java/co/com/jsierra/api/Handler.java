package co.com.jsierra.api;

import co.com.jsierra.usecase.billspayment.BillspaymentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private  final BillspaymentUseCase billspaymentUseCase;

    public Mono<ServerResponse> getBills(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().body(Mono.just("getBills"), String.class);
    }

    public Mono<ServerResponse> paymentBill(ServerRequest serverRequest) {
        // useCase2.logic();
        return ServerResponse.ok().body(Mono.just("paymentBill"), String.class);
    }

    public Mono<ServerResponse> getBillsById(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().body(Mono.just("getBillsById"), String.class);
    }

    public Mono<ServerResponse> getCost(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().body(Mono.just("getCost"), String.class);
    }
}
