import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    private Map<String, Contact> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber, String email, String gender, String dateOfBirth) {
        Contact contact = new Contact(name, phoneNumber, email, gender, dateOfBirth);
        contacts.put(name, contact);
    }

    public void updateContact(String name, String phoneNumber, String email, String gender, String dateOfBirth) {
        Contact contact = contacts.get(name);
        if (contact != null) {
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);
            contact.setGender(gender);
            contact.setDateOfBirth(dateOfBirth);
            contacts.put(name, contact);
        } else {
            System.out.println("Contact not found!");
        }
    }

    public Contact searchContact(String name) {
        return contacts.get(name);
    }

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        // Adding contacts
        contactManager.addContact("Harsh Pradhan", "1234567890", "Harsh.Pradhan@capgemini.com", "Male", "1990-01-01");
        contactManager.addContact("Pooja Vaswani", "9876543210", "Pooja.Vaswani@capgemini.com", "Female", "1995-05-10");

        // Searching contacts
        Contact HarshPradhan = contactManager.searchContact("Harsh Pradhan");
        if (HarshPradhan != null) {
            System.out.println("Found contact: " + HarshPradhan);
        } else {
            System.out.println("Contact not found!");
        }

        // Updating contact
        contactManager.updateContact("Pooja Vaswani", "9999999999", "Pooja.Vaswani@example.com", "Female", "1995-05-10");

        // Searching contacts again
        Contact PoojaVaswani = contactManager.searchContact("Pooja Vaswani");
        if (PoojaVaswani != null) {
            System.out.println("Updated contact: " + PoojaVaswani);
        } else {
            System.out.println("Contact not found!");
        }
    }
}

class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private String gender;
    private String dateOfBirth;

    public Contact(String name, String phoneNumber, String email, String gender, String dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}

