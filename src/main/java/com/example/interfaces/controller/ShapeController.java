package com.example.interfaces.controller;

import com.example.interfaces.domain.Circle;
import com.example.interfaces.domain.Square;
import com.example.interfaces.domain.interfaces.Shape;
import com.example.interfaces.service.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/shape")
public class ShapeController {

    @Autowired
    ShapeService shapeService;


    @PostMapping
    public Double getArea(@RequestBody @Valid Shape shape){

        return this.shapeService.getArea(shape);
    }

    //ver notnull - ok
    //teste de controller
    //springfox

}
