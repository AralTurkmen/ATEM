import java.time.LocalDate;

Public class Hardware {

    private String name;
    private String manufacturer;
    private int serialNumber;
    private LocalDate purchaseDate;

    public Hardware(String name, String manufacturer, int serialNumber, LocalDate purchasDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
    }
    public String getName(){
        return name;
    }
    public String getManufacturer(){
        return manufacturer;
    }
}