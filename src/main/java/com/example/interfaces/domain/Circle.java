package com.example.interfaces.domain;


import com.example.interfaces.domain.interfaces.Shape;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
@JsonTypeName("circle")
@Valid
public class Circle implements Shape {
    @NotNull
    private Double radius;

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
