package com.example.interfaces.service;

import com.example.interfaces.domain.interfaces.Shape;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {
    public Double getArea(Shape shape) {
        return shape.getArea();
    }
}
