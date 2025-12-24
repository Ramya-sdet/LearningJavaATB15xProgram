package ex_06_Ternary_Operator;

public class Lab068_Age_Classification {
    // A user input will give you an age.
    // You need to check if the user is minor, adult or senior citizen.
    public static void main(String[] args) {
        // User will give you input via the commandline.
        String age_input_string = args[0];
        System.out.println(age_input_string instanceof String);
        int age_user_input = Integer.parseInt(age_input_string); // 25

        String result = (age_user_input < 18) ? "Minor" : (age_user_input <= 60) ? "Adult" : "Sr. Citizen";
        System.out.println(result);

    }
}