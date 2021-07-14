package com.example.interfaces.domain;


import com.example.interfaces.domain.interfaces.Shape;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Circle implements Shape {

    private Double radius;

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
