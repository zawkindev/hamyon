package zawkin.asuna.hamyon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zawkin.asuna.hamyon.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
