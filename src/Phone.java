import java.util.List;
import java.util.function.Predicate;

// parent class to be inherited from
public class Phone {

    protected String brand;
    protected String model;
    protected String osVersion;
    protected List<Contact> contacts;

    public List<Contact> getContactByLetter(String letter) {
        // using stream for filtering
        return contacts.stream().filter(new Predicate<Contact>() {
            @Override
            public boolean test(Contact contact) {
                return contact.getName().startsWith(letter);
            }
        }).toList();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
