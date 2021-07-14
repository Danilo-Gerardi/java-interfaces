package com.example.interfaces.repository;

import com.example.interfaces.domain.Circle;
import com.example.interfaces.domain.Square;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CircleRepository extends MongoRepository<Circle, UUID> {
}
