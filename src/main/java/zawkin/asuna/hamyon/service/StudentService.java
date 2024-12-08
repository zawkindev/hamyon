package zawkin.asuna.hamyon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zawkin.asuna.hamyon.entity.StudentEntity;
import zawkin.asuna.hamyon.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentEntity create(StudentEntity entity) {
        studentRepository.save(entity);
        return entity;
    }
}
