package com.example.spring_data.repository.primary;

import com.example.spring_data.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryPersonRepository extends JpaRepository<Person, Long> {
}