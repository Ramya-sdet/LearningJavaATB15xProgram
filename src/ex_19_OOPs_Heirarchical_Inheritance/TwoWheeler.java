package ex_19_OOPs_Heirarchical_Inheritance;

public class TwoWheeler extends Vehicle {

    double increasePriceBy = 0.20; // 0.2 times

    void finalPrice() {
        basePrice = basePrice + (basePrice * increasePriceBy);
        System.out.println(
                "After modification, The price of bike is: Rs." + basePrice
        );
    }
}
