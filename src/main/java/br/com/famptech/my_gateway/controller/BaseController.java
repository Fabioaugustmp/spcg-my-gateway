package br.com.famptech.my_gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BaseController {


    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback system is down!");
    }

    @RequestMapping("/notifications")
    public Mono<String> canaryMono() {
        return Mono.just("This is a canary response!!!");
    }

}
