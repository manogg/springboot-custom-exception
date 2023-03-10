package com.mlv.springbootcustomexception.controller;

import com.mlv.springbootcustomexception.entity.Student;
import com.mlv.springbootcustomexception.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
       return studentService.saveStudent(student);
    }
    @GetMapping("/getById")
    public Optional<Student> getStudent(@RequestParam(name="id") Integer id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/getAll")
    public List<Student> getStudentList(){
        return studentService.studentList();
    }

}
