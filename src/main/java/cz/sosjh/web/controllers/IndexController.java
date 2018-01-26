package cz.sosjh.web.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(path = "/", produces = MediaType.TEXT_HTML_VALUE)
    public void index(){
        ResponseEntity.ok("<html><body><h1>Hello</h1></body></html");
    }
}

