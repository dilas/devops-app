package br.com.cabal.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/memory")
public class MemoryController {

    @GetMapping("/start")
    public void start() {
        // TODO implementation
    }
}
