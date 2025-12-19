package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A';
        // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; String - "" - bunch of chars.
        char c2 = 'B';
        System.out.println(c2);
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("StrangeWorld");
        System.out.println("Strange" + new_line + "World");
        System.out.println("Strange\npeople");
        System.out.println("Strange" + tab_line + "World");
        System.out.println("Strange" + back_space + "World");
        System.out.println("Strange" + carriage_return + "World");

        System.out.println(" ----- ");

        System.out.println("Hi, This is a First line" + new_line + "This is second line\n This is Third line");


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65


        char ruppes = '₹';
        System.out.println(ruppes);


        char A = '\u0065'; // :)
        System.out.println(A);

        int binary = 0b1010;
        int hex = 0xFF;
        long amount = 1_00_000L;
        System.out.println(amount);

        // char A  = "10";
        char c = 'A'; // 65
        System.out.println(c);


    }

}
