package zawkin.asuna.hamyon.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zawkin.asuna.hamyon.entity.StudentEntity;
import zawkin.asuna.hamyon.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    private StudentEntity create(@RequestBody StudentEntity entity) {
        return studentService.create(entity);
    }
}
