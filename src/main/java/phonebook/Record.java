package phonebook;

public class Record {
    // Идентификатор контакта
    private Long contactId;
    // Имя
    private String firstName;
    // Фамилия
    private String lastName;
    // Телефон
    private String phoneNumber;

    public void Contact() {
    }

    public void Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public void Contact(Long contactId, String firstName, String lastName, String phoneNumber) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
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

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phone) {
        this.phoneNumber = phone;
    }


    @Override
    public String toString() {
        return "Contact{" + "contactId=" + contactId +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", phone=" + phoneNumber +
                ", email=" + email + '}';
    }
}
