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
public class Square implements Shape {
    private Double length;
    private Double width;

    @Override
    public Double getArea() {
        return this.length * this.width;
    }
}
