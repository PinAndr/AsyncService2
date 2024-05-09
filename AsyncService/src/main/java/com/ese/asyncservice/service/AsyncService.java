package com.ese.asyncservice.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class AsyncService {

   @Autowired
   private AsyncService2 asyncService2;

    public String normalMethodReturnString() throws InterruptedException, ExecutionException {
        var uno = asyncService2.asyncMethodReturnString();
        var due = asyncService2.asyncMethodReturnStringAsync();

        return asyncService2.asyncMethodReturnString().get()+asyncService2.asyncMethodReturnStringAsync().get();
    }

}
