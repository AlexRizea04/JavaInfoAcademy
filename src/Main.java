import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        MimedDatabase database = new MimedDatabase();
        Iphone iphone = new Iphone("Iphone 13 ProMax", "Iphone", IosVersionEnum.IOS_14.name(), database.getIphoneContacts());
        Samsung samsung = new Samsung("S23", "Samsung", AndroidVersionEnum.RED_VELVET_CAKE.name(), database.getSamsungContacts());
        User alex = new User("Alex");
        User andrei = new User("Andrei");

        // second collection usage
        Map<User, Phone> ownerMap = new HashMap<>();
        ownerMap.put(alex, iphone);
        ownerMap.put(andrei, samsung);

        getIphoneData(iphone);
        System.out.println("============================================");
        getSamsungData(samsung);
        System.out.println("============================================");

        for (User user : ownerMap.keySet()) {
            System.out.println("User: " + user);
            System.out.println("Phone: " + ownerMap.get(user));
            System.out.println("*****************************");
        }
    }

    private static void getIphoneData(Iphone iphone) {
        // Iphone
        System.out.println("Print Iphone details: ");
        System.out.println(iphone);
        System.out.println("Get Iphone Current Version: ");
        System.out.println(iphone.getOsVersion());
        System.out.println("Update Iphone Version: ");
        iphone.updateVersion(IosVersionEnum.IOS_16.name());
        System.out.println(iphone.getOsVersion());
        System.out.println("Get contact by letter: A");
        System.out.println(iphone.getContactByLetter("A"));
    }

    private static void getSamsungData(Samsung samsung) {
        //Samsung
        System.out.println("Print Samsung details: ");
        System.out.println(samsung);
        System.out.println("Get Samsung Current Version: ");
        System.out.println(samsung.getOsVersion());
        System.out.println("Update Samsung Version: ");
        samsung.updateVersion(AndroidVersionEnum.TIRAMISU.name());
        System.out.println(samsung.getOsVersion());
        System.out.println("Get contact by letter: L");
        System.out.println(samsung.getContactByLetter("L"));
    }
}