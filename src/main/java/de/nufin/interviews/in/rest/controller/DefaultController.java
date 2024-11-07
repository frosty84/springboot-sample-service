package de.nufin.interviews.in.rest.controller;

import de.nufin.interviews.models.IndexReturnObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public IndexReturnObject index(
            @RequestParam(value="name") String name
    ) {
        return new IndexReturnObject(name);
    }
}
