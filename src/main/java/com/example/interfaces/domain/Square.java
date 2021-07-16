package com.example.interfaces.domain;

import com.example.interfaces.domain.interfaces.Shape;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
@JsonTypeName("square")
@Valid
public class Square implements Shape {

    @NotNull
    private Double length;
    @NotNull
    private Double width;

    @Override
    public Double getArea() {
        return this.length * this.width;
    }
}
