package za.ac.cput.donation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.donation.entity.Student;
import za.ac.cput.donation.service.StudentServiceImpl;

@RestController
@RequestMapping("/auth/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl service;

    @GetMapping("/find/{id}")
    public Student find(@PathVariable long id) {
        return service.find(id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id) {
        return service.delete(id);
    }

    @PostMapping("/update")
    public Student update(@RequestBody Student student) {
        return service.update(student);
    }
}
