package student_library_management.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student_library_management.library_management.model.Card;
import student_library_management.library_management.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
