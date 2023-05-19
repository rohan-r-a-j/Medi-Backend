package com.emedical.springboot.emedical.dao;
/*
Code by Team A of Java3-
Rohan, Vidisha, Yash, Kunal, Shivam, Anmol
*/
import com.emedical.springboot.emedical.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
        Optional<User> findByUsername(String username);

        Boolean existsByUsername(String username);

        Boolean existsByEmail(String email);
        }
