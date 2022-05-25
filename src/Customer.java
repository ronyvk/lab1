
//Rony Varghese
//   200455686
import java.time.LocalDate;

public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String PhoneNumber;
    private LocalDate dateOfBirth;

    public Customer(String firstName, String lastName, String address, String phNum, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.PhoneNumber = PhoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhNumber() {
        return this.PhoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setFirstName(String fName) {
        if (!fName.matches("[a-z A-Z_]+")) {
            throw new IllegalArgumentException("\nPlease enter letters only");
        } else {
            this.firstName = fName;
        }
    }

    public void setLastName(String lName) {
        if (!lName.matches("[a-z A-Z_]+")) {
            throw new IllegalArgumentException("Please enter letters only");
        } else {
            this.lastName = lName;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhNumber(String phone) {
        this.PhoneNumber = phone;
    }

    public void setDateOfBirth(int year, int month, int day) {
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    public String toString() {
        return "\nCUSTOMER DETAILS\n\nName           : " + this.getFirstName() + " " + this.getLastName() + "\nAddress        : " + this.getAddress() + "\nPhoneNumber    : " + this.getPhNumber() + "\nDate Of Birth  : " + this.getDateOfBirth();
    }
}
