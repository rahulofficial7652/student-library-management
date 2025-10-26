package student_library_management.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import student_library_management.library_management.model.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // write own customize query
    @Query(nativeQuery = true, value = "select * from student where email = :inputEmail")
    public Student getStudentByEmail(String inputEmail);

    @Query(nativeQuery = true, value = "select * from student where name = :inputDept")
    public List<Student> getStudentByName(String inputDept);

}
