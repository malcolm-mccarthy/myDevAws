package com.example.simple.controller;

import com.example.simple.model.Quark;
import com.example.simple.model.QuarkType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class SimpleRestController {

    @RequestMapping(value="/getupquark", method= RequestMethod.GET)
    Quark getUpQuark(){
        Quark quark = new Quark();
        quark.setType(QuarkType.UP);
        return quark;
    }

}
