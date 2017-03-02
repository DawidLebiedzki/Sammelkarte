package model;


import javax.persistence.*;

@Entity(name = "user_roles")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    @JoinColumn(name = "username")
    private User user;

    private String role;

    public UserRole(){};

    public UserRole(User user, String role) {
        this.user = user;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
