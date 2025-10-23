package student_library_management.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student_library_management.library_management.model.Transcation;

public interface TranscationRepository extends JpaRepository <Transcation, Integer> {
}
