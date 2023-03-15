import java.util.List;

// child class that inherits from Phone and implements Android interface
public class Samsung extends Phone implements Android {

    public Samsung(String model, String brand, String version, List<Contact> contacts) {
        this.brand = brand;
        this.model = model;
        this.osVersion = version;
        this.contacts = contacts;
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening Google Chrome browser.");
    }

    @Override
    public String getVersion() {
        return getOsVersion();
    }

    @Override
    public void updateVersion(String version) {
        setOsVersion(version);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", \ncontacts=" + contacts +
                '}';
    }
}
