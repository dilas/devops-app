package br.com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController("/memory")
public class MemoryController {

    private Random random = new Random();

    public static final ArrayList<Double> list = new ArrayList<Double>(1000000);

    @GetMapping("/start")
    public void start() throws InterruptedException {
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextDouble());
        }

        System.gc();
        Thread.sleep(10000);
    }
}
