package student_library_management.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student_library_management.library_management.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository <Author, Integer> {
}
