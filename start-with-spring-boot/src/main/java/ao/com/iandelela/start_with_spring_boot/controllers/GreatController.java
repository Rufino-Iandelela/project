package ao.com.iandelela.start_with_spring_boot.controllers;

import ao.com.iandelela.start_with_spring_boot.model.Greating;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreatController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greating")
    public Greating geating(
            @RequestParam(value = "name", defaultValue = "wolrd")
            String name) {
        return new Greating(counter.incrementAndGet(), String.format(template, name));
    }
}
