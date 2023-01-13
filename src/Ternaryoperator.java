import java.util.Scanner;
public class Ternaryoperator {
    public static void main (String...args){
        String result;
        Scanner input = new Scanner(System.in);
       int mark = input.nextInt();
        result = mark>=50 ? "pass":"fail";
        System.out.println("Result is "+result);
    }
}
