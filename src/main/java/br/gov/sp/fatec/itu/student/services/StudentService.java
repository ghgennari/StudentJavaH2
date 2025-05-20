package br.gov.sp.fatec.itu.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.itu.student.entities.Student;
import br.gov.sp.fatec.itu.student.repositories.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository repository;

    public List<Student> getAll(){
        return repository.findAll();
    }

    public Student save(Student student){
        return repository.save(student);
    }
}
