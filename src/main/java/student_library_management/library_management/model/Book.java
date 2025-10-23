package student_library_management.library_management.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;

@Entity
@Table(name="book")
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name="publisher_name", nullable = false)
    private String publisherNmae;

    @Column(name = "publication_date", nullable = false)
    private String publicationDate;

    @Column(name = "availability", nullable = false)
    private boolean available;

    @Column(name="category", nullable = false)
    private String category;

    @Column(name="rank_no", nullable = false)
    private String rankNo;

    @JsonBackReference
    @JoinColumn
    @ManyToOne
    private Author author;

    @JsonBackReference
    @JoinColumn
    @ManyToOne
    private Card card;

    @JsonManagedReference
    @OneToMany(mappedBy = "book")
    private List<Transcation> transcationList;

}
