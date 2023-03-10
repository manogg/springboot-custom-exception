package com.mlv.springbootcustomexception.repository;

import com.mlv.springbootcustomexception.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
