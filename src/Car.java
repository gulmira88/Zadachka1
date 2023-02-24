import java.time.LocalDate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Car  implements Type {
    private String brand;
    private LocalDate dateOfMade;
    private BigDecimal price;
    private Type type;

    public Car(String brand, LocalDate dateOfMade, BigDecimal price, Type type) {
        this.brand = brand;
        this.dateOfMade = dateOfMade;
        this.price = price;
        this.type=type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setTypeCar(Type type) {
        this.type = type;
    }


    public void bodyTypeIdentification(Type type) {
        switch (Type ){
            case "SEDAN":
                System.out.println("Легковой классындагы машина");
                break;
            case "HATCHBACK":
                System.out.println("Легковой классындагы машина");
                break;
            case "CROSSOVER":
                System.out.println("Bнедорожник классындагы машина");
                break;
            case "UNIVERSAL":
                System.out.println("Универсал классындагы машина");
                break;
        }
    }

    public void determinationYearOfManufacture(LocalDate dateOfMade) {
        int date=Period.between(dateOfMade,LocalDate.now()).getYears();
        System.out.println("Чыгарылганына "+date+" жыл болду");

    }

    @Override
    public String toString() {
        return "Car: " +
                "brand: " + brand + '\'' +
                ", dateOfMade: " + dateOfMade +
                ", price: " + price +
                ", type: " + type;






}


}
