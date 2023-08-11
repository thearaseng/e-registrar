package edu.miu.swe.eregistrar.controller;

import edu.miu.swe.eregistrar.model.Student;
import edu.miu.swe.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students/index";
    }

    @GetMapping("/students/edit/{id}")
    public String students(@PathVariable("id") Long id, Model model) {
        Student student = this.studentService.findById(id);
        model.addAttribute("student", student);
        return "students/edit";
    }

    @PostMapping("/students/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/students";
    }

    @PostMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteById(id);
        return "redirect:/students";
    }

}
