package learning.springframework.sfgpetclinic.model;

public class Person extends BaseEntity {

    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}