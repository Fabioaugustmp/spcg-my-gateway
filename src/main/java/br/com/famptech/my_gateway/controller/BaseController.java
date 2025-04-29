package br.com.famptech.my_gateway.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BaseController {

    @RequestMapping("/fallback")
    public Mono<String> fallback(){
        return Mono.just("fallback system is down");
    }

    @RequestMapping(value = "/notifications", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> canaryMono() {
        return Mono.just("""
                {
                    "id": 100,
                    "orderId": "69110be9-d8af-415f-b7b1-a89adaa7cee0",
                    "email": "fabio.paula@gmail.com",
                    "createdAt": "2025-04-24T13:55:50"
                }""");
    }

}
