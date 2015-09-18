package Models;

public abstract class Human {
    private String firstName = null;
    private String lastName = null;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    @Override
    public String toString() {
        return String.format
                ( "First name: " + this.getFirstName() +
                " Last name: " + this.getLastName());
    }
}
