package com.example.interfaces.controller;

import com.example.interfaces.domain.interfaces.Shape;
import com.example.interfaces.service.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/shape")
public class ShapeController {

    @Autowired
    ShapeService shapeService;


    @PostMapping
    public Double getArea(@RequestBody @Valid Shape shape) {

        return this.shapeService.getArea(shape);
    }

    //ver notnull - ok
    //teste de controller
    //springfox - ok

}
