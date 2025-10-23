package student_library_management.library_management.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name ="author")
public class Author {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name ="rating")
    private String rating;

    @JsonManagedReference
    @OneToMany(mappedBy = "author")
    private List<Book> bookByAuthor;


}
