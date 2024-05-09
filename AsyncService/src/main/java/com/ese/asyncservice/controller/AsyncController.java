package com.ese.asyncservice.controller;

import com.ese.asyncservice.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import javax.swing.text.html.parser.Entity;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/asyncService")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/print")
    public ResponseEntity<String> getAsyncPrint() {
        try {
            return ResponseEntity.ok(asyncService.normalMethodReturnString());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }


}
