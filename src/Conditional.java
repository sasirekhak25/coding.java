
      import java.util.Scanner;
    public class Conditional{
        public static void main(String args[])
        {
            int result;
            System.out.println("Enter the Mark scored");
            Scanner input = new Scanner(System.in);
            int mark = input.nextInt();
            result = mark>=40 ? mark+10 : mark+20;
            System.out.println(result);

        }
    }

