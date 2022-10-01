package com.example.spring_data.repository.secondary;

import com.example.spring_data.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecondaryPersonRepository extends JpaRepository<Person, Long> {
}