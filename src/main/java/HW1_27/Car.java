package HW1_27;

public class Car {
    String brand;
    double price;

    double totalOwed (){
        double downPayment = 12000;
        return (price-downPayment);
    }

    double getPrice (){
        return price;
    }

}
