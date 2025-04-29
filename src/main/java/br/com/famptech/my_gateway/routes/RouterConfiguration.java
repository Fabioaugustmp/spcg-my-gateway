package br.com.famptech.my_gateway.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RouterConfiguration {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r
                        .path("/orders/**")
                        .filters(f -> f
                                .prefixPath("/api")
                                .circuitBreaker(config -> config
                                        .setName("circuitBreaker")
                                        .setFallbackUri("forward:/fallback")))
                        .uri("http://192.168.1.246:9082")
                )
                .build();
    }

}
