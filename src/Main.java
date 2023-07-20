import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car Araba1=new Car("H1",1,"Honda","Red",15000,"Diesel");
        Car Araba2=new Car();
        Araba2.setId(2);
        Araba2.setFueltype("Gas");
        Araba2.setPrice(12000);
        Araba2.setKod("T2");
        Araba2.setModel("Toyota");
        Araba2.setColor("Blue");
        System.out.println(Araba1.getId());
        System.out.println(Araba1.getKod());
        System.out.println(Araba1.getModel());
        System.out.println(Araba1.getColor());
        System.out.println(Araba1.getPrice()+"dollar");
        System.out.println(Araba1.getFueltype());
        System.out.println("----------------------------");
        System.out.println(Araba2.getId());
        System.out.println(Araba2.getKod());
        System.out.println(Araba2.getModel());
        System.out.println(Araba2.getColor());
        System.out.println(Araba2.getPrice()+"dollar");
        System.out.println(Araba2.getFueltype());

    }
}