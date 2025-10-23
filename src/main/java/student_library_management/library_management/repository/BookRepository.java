package student_library_management.library_management.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student_library_management.library_management.model.Book;

@Repository
public interface BookRepository extends JpaRepository <Book, Integer> {
}
