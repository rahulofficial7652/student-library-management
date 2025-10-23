package student_library_management.library_management.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
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

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "dept", nullable = false)
    private int dept;

    @Column(name = "semester", nullable = false)
    private int semester;

    @Column(name = "gender", nullable = false)
    private int gender;

    @JsonManagedReference
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Card card;
}
