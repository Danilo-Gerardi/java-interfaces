package com.example.interfaces.controller;

import com.example.interfaces.domain.Circle;
import com.example.interfaces.domain.Square;
import com.example.interfaces.service.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shape")
public class ShapeController {

    @Autowired
    ShapeService shapeService;


    @PostMapping("/square")
    public Double getArea(@RequestBody Square square){
        return this.shapeService.getArea(square);
    }

    @PostMapping("/circle")
    public Double getArea(@RequestBody Circle circle){
        return this.shapeService.getArea(circle);
    }


}
