import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Car {
    private String model;
    @EqualsAndHashCode.Include
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;
}

class DemoCar {

    public static void main(String[] args) {
        Car car1 = new Car("Q3", "Audi", 2010, 100000, "white", 5);
        Car car2 = new Car("Q5", "Audi", 2020, 250000, "black", 5);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());
        System.out.println(car2.getModel());
        int year = car1.getYear();
        car2.setPrice(200000);
        System.out.println("Are this objects equal? "+car1.equals(car2));
        System.out.println("The hashcode of car1 object is: "+car1.hashCode());
        System.out.println("The hashcode of car2 object is: "+car2.hashCode());




    }
}
