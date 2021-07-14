package com.example.interfaces.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CircleDto extends ShapeDto<CircleDto>{
    Double radius;
}
