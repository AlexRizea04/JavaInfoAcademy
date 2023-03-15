import java.util.Arrays;
import java.util.List;

public class MimedDatabase {

    // Database simulator with first collection usage

    public List<Contact> getSamsungContacts() {
        // simulating contacts for Samsung Phone
        return Arrays.asList(new Contact("Andrei", "0721234567"),
                new Contact("Lizuca", "898989989"),
                new Contact("Dorel", "0732123987"));
    }

    public List<Contact> getIphoneContacts() {
        // simulating contacts for Iphone phone
        return Arrays.asList(new Contact("Mihai", "0722333444"),
                new Contact("John", "0777666555"),
                new Contact("Aurica", "0766777888"),
                new Contact("Azorel", "0755666777"));
    }
}
