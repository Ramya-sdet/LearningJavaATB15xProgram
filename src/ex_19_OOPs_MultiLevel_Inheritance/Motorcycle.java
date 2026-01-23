package ex_19_OOPs_MultiLevel_Inheritance;
class Motorcycle extends Cycle {
    void display() {
        super.display();
        System.out.println("Bike with an engine");
    }
}