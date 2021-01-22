package com.training.etiya.rest.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public Future<String> myMethod(final int ol) {
        System.out.println("Osman");
        return CompletableFuture.completedFuture("Str " + ol);
    }

}
