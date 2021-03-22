package co.com.jsierra.model.bill.gateways;

import co.com.jsierra.model.bill.Logs;
import reactor.core.publisher.Mono;

public interface LogsGateway {
    Mono<Logs> sendLogsQueue();
}
