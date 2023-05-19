package com.emedical.springboot.emedical.dao;
/*
Code by Team A of Java3-
Rohan, Vidisha, Yash, Kunal, Shivam, Anmol
*/
import com.emedical.springboot.emedical.models.ERole;
import com.emedical.springboot.emedical.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
