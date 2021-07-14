package com.example.interfaces.service;

import com.example.interfaces.domain.Circle;
import com.example.interfaces.domain.Square;
import com.example.interfaces.domain.interfaces.Shape;
import com.example.interfaces.dto.ShapeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {
    public Double getArea(Shape shape){
        return shape.getArea();
    }
}
