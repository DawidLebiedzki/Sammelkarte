package model;


import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserForm {

    @NotNull(message = "")
    @Size(min = 2,max = 30)
    private String firstName;

    @NotNull
    @Size(min = 2,max = 30)
    private String lastName;

    @NotNull
    @Digits(integer = 3, fraction = 2)
    private String username;

    @NotNull
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
