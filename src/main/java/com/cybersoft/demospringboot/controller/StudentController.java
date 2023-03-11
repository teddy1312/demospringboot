package com.cybersoft.demospringboot.controller;

import com.cybersoft.demospringboot.model.StudentModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    List<StudentModel> list = new ArrayList<>();

    @PostMapping("")
    public ResponseEntity<?> index(@RequestParam String name, int age){
        StudentModel studentModel = new StudentModel();

        studentModel.setName(name);
        studentModel.setAge(age);
        list.add(studentModel);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/{name}/{age}")
    public ResponseEntity<?> index(@PathVariable String name,@PathVariable String age){
        StudentModel studentModel = new StudentModel();

        studentModel.setName(name);
        studentModel.setAge(Integer.parseInt(age));
        list.add(studentModel);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<?> index(@RequestBody StudentModel student){
        list.add(student);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
