package cz.sosjh.web.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping(path = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String index(@RequestParam(name = "myName", defaultValue = "World") String myName){
        return "index";
    }
}

