package com.crud.web.controller;

import com.crud.web.entity.Student;
import com.crud.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping({"/students","/"})
    public String getAllStudent(Model model) {
        model.addAttribute("students", (studentService.getAllStudent()));
        return "students";
    }

    @GetMapping({"/students/new"})
    public String showCreateStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "createStudent";
    }

     @PostMapping({"/saveStudent"})
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
     }

    @GetMapping("/students/update/{id}")
    public String showUpdateStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.findStudentById(id));
        return "editStudent";
     }

     @PostMapping({"/students/{id}"})
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model){
        Student existendStudent = studentService.findStudentById(id);
         existendStudent.setId(id);
         existendStudent.setName(student.getName());
         existendStudent.setLastname(student.getLastname());
         existendStudent.setEmail(student.getEmail());
        studentService.updateStudent(existendStudent);
         return "redirect:/students";
     }

     @GetMapping({"/students/{id}"})
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "redirect:/students";
     }
}
