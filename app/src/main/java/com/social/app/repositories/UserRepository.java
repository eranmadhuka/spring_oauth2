package com.social.app.repositories;

import com.social.app.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByProviderId(String providerId);
    Optional<User> findByEmail(String email);
    List<User> findByIdIn(List<String> ids);
}