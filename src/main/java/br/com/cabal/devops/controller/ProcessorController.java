package br.com.cabal.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/processor")
public class ProcessorController {

    @GetMapping("/start")
    public void start() {
        // TODO implementation
    }
}
