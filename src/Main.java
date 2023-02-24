import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

            Car honda = new Car("Honda", LocalDate.of(2016,2,1),new BigDecimal(2200000),
                    Type.SEDAN);
            System.out.println(honda);
            honda.determinationYearOfManufacture(honda.getDateOfMade());
            honda.bodyTypeIdentification(honda.getType());

        System.out.println("+++++++++++++++++++++++++++++");
        





        }
}