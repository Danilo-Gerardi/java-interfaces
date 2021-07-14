package com.example.interfaces.repository;

import com.example.interfaces.domain.Square;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SquareRepository extends MongoRepository<Square, UUID> {
}
