import java.util.Scanner;
public class Gradeop {
    public static void main(String...args){
        char grade;
        System.out.println("Enter the value");
        Scanner input=new Scanner(System.in);
        int mark = input.nextInt();
        grade=(mark>=80)? 'A':mark>=60 && mark<80? 'B':'c';
        System.out.println(grade);
    }


}
