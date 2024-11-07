package de.nufin.interviews.in.rest.controller;

import de.nufin.interviews.models.IndexReturnObject;
import de.nufin.interviews.service.Greater;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    private final Greater greater;

    public DefaultController(Greater greater) {
        this.greater = greater;
    }

    @GetMapping("/greet")
    public IndexReturnObject index(
            @RequestParam(value="name") String name
    ) {
        return new IndexReturnObject(greater.great(name));
    }
}
