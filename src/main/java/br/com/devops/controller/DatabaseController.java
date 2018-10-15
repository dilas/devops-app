package br.com.devops.controller;

import br.com.devops.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/database")
public class DatabaseController {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private JdbcTemplate template;

    @GetMapping("/start")
    public void start() throws InterruptedException {
        while (true) {
            logger.info("[Connection Check] - Trying to execute SQL statement...");
            template.queryForList("SELECT 1 FROM DUAL");
            logger.info("[Connection Check] - Done OK.");

            Thread.sleep(3000);
        }
    }
}
