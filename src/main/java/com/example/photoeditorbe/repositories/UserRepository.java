package com.example.photoeditorbe.repositories;

import com.example.photoeditorbe.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
