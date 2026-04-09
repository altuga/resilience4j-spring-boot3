package io.github.robwin.service;

import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public interface Service {
    String failure();

    String failureWithFallback();

    String success();

    String successException();

    String ignoreException();

    Mono<String> monoSuccess();

    Mono<String> monoFailure();

    Mono<String> monoTimeout();

    CompletableFuture<String> futureSuccess();

    CompletableFuture<String> futureFailure();

    CompletableFuture<String> futureTimeout();

}
