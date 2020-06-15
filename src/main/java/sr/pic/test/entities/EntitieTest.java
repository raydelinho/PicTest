package sr.pic.test.entities;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "test")
public class EntitieTest {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="file")
    private String file;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFile() {
        return file;
    }
}
