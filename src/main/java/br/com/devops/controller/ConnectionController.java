package br.com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController("/connection")
public class ConnectionController {

    @GetMapping("/start")
    public void start() {
    }
}
