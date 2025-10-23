package student_library_management.library_management.model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "card_status", nullable = false)
    private String cardStatus;

    @Column(name="expiry_date", nullable = false)
    private String expiryDate;

    @Column(name = "created_date", nullable = false)
    @CreationTimestamp
    private String createdDate;

    @Column(name = "updated_date", nullable = false)
    @UpdateTimestamp
    private String updatedDate;

    @JsonBackReference
    @JoinColumn
    @OneToOne
    private Student student;

    @JsonManagedReference
    @OneToMany(mappedBy = "card")
    private List<Book> booksOfCard;

    @JsonManagedReference
    @OneToMany(mappedBy="card")
    private List<Transcation> transactions;
}
