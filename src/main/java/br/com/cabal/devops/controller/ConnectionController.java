package br.com.cabal.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/connection")
public class ConnectionController {

    @GetMapping("/start")
    public void start() {
        // TODO implementation
    }
}
