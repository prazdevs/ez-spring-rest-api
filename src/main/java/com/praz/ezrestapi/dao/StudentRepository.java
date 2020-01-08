package com.praz.ezrestapi.dao;

import com.praz.ezrestapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> { }
