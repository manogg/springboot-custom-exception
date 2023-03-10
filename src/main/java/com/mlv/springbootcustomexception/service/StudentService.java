package com.mlv.springbootcustomexception.service;

import com.mlv.springbootcustomexception.entity.Student;
import com.mlv.springbootcustomexception.exception.HandleEmpty;
import com.mlv.springbootcustomexception.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student){

        if(student.getStuName().isEmpty() ||
                student.getStuGender().isEmpty()||student.getStuContact()==0)
            throw new HandleEmpty("Some fields are missing :"
                    +student.getStuName()+" : "+student.getStuGender()+" : "+student.getStuContact());

        return studentRepository.save(student);
    }

    public Optional<Student> getStudentById(Integer id){
        Optional<Student> stuById=studentRepository.findById(id);
        if(stuById.isEmpty()){
            throw new NoSuchElementException();
        }
        else{
            return stuById;
        }
    }

    public List<Student> studentList(){
        List<Student> stulist=null;

        stulist=studentRepository.findAll();

        if(stulist.isEmpty()){
            throw new NoSuchElementException();
        }
        return stulist;
    }

}
