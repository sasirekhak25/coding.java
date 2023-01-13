import java.util.Scanner;
public class Palandrome {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int no = sc.nextInt();
        int org_no = no;
        int rem = 0;
        while (no != 0) {
            rem = rem * 10 + no % 10;
            no = no / 10;
        }
        if (org_no == rem) {
            System.out.println(org_no + "palandrome no");
        } else {
            System.out.println(org_no + "is not a palandrome no");
        }
    }
}