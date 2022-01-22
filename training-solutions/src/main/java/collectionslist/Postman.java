package collectionslist;

import java.util.ArrayList;
import java.util.List;

public class Postman {

    private final List<String> addresses = new ArrayList<>();

    public List<String> getAddresses() {
        return addresses;
    }

    public void addAddress(String address) {
        addresses.add(address);
    }

    public void removeAddress(String address) {
        addresses.remove(address);
    }
}
