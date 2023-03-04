package at.htl.leonding.demo.entity.user;

import javax.persistence.*;

@Entity
@Table(name = "TB_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //region Constructors
    public User() {
    }

    public User(String name) {
        this.name = name;
    }
    //endregion

    //region getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion


    @Override
    public String toString() {
        return String.format("%d: %s", id, name);
    }
}
