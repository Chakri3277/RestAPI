package binding;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "COURSE_CC")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
}
