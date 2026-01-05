package ex_10_For_Loop;

public class Lab103_For_If_LOOP {
    public static void main(String[] args) {
        for (int age = 0; age < 18; age++) {
            if( age > 15){
                System.out.println("Not-Eligible to Vote");
            }else{
                System.out.println("Eligible to Vote");
            }

        }
    }
}
