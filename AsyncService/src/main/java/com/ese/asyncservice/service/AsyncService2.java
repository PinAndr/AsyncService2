package com.ese.asyncservice.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService2 {

    @Async
    public CompletableFuture<String> asyncMethodReturnString() throws InterruptedException {
        System.out.println("AsyncMethodReturnString");
        Thread.sleep( 10000L); // prova delay
        return CompletableFuture.completedFuture("AsyncMethodReturnString");
    }

    @Async
    public CompletableFuture<String> asyncMethodReturnStringAsync() throws InterruptedException {
        System.out.println("AsyncMethodReturnStringAsync");
        Thread.sleep( 10000L);
        return CompletableFuture.completedFuture("AsyncMethodReturnStringAsync");
    }


}
