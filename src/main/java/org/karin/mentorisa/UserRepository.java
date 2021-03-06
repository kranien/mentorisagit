package org.karin.mentorisa;

import org.springframework.data.repository.CrudRepository;

import org.karin.mentorisa.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

    public User findByEmail(String email);
}