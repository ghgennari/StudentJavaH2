package br.gov.sp.fatec.itu.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.itu.student.entities.Student;
import br.gov.sp.fatec.itu.student.repositories.StudentRepository;
import br.gov.sp.fatec.itu.student.services.StudentService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("students")
public class StudentController {
    
    @Autowired
    private StudentService service;

    @GetMapping
    public ResponseEntity<List<Student>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

}
