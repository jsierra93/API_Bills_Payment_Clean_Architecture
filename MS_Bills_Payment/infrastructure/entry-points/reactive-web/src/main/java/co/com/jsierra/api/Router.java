package co.com.jsierra.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;


@Configuration
public class Router {
    private static final String PATH_BILLS = "/v1/bills";
    private static final String PATH_COST = "/v1/cost";

    @Bean
    public RouterFunction<ServerResponse> routerFunction(Handler handler) {
        return route(GET(PATH_BILLS), handler::getBills)
                .andRoute(GET(PATH_BILLS + "/{id}"), handler::getBillsById)
                .andRoute(POST(PATH_BILLS + "/payment").and(accept(MediaType.APPLICATION_JSON)), handler::paymentBill)
                .andRoute(GET(PATH_COST), handler::getCost);

    }
}
