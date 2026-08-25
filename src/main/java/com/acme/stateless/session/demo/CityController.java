package com.acme.stateless.session.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "/exists", produces = MediaType.TEXT_PLAIN_VALUE)
    public String exists() {
        return Boolean.toString(this.cityService.existsCity42());
    }

}
