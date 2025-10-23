package student_library_management.library_management.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Getter
@Setter
@Table(name="transcation")
public class Transcation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "transcation_date", nullable = false)
    @CreationTimestamp
    private Date transcationDate;

    @Column(name="due_date", nullable = false)
    private String dueDate;

    @Column(name = "transcation_type", nullable = false)
    private String transcationType;

    @JsonBackReference
    @JoinColumn
    @ManyToOne
    private Card card;

    @JsonBackReference
    @JoinColumn
    @ManyToOne
    private Book book;

}
