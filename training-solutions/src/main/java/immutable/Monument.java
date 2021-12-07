package immutable;

import java.time.LocalDate;

public class Monument {

    private final String name;
    private final String adress;
    private final LocalDate registryDate;
    private final String registryNumber;

    public Monument(String name, String adress, LocalDate registryDate, String registryNumber) {
        if (name.isBlank() || adress.isBlank() || registryNumber.isBlank()) {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }

        this.name = name;
        this.adress = adress;
        this.registryDate = registryDate;
        this.registryNumber = registryNumber;
    }

    private boolean isBlank(String text) {
        return text == null || text.isBlank();
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public LocalDate getRegistryDate() {
        return registryDate;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }
}
