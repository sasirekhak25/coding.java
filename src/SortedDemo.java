import java.util.Scanner;
public class SortedDemo {
    public static void main(String...args){
        System.out.println("Enter the value");
        Scanner sc= new Scanner(System.in);
        int a[]= new int[5];
        int i;
        int temp=0;
        for (i=0; i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        for (i=0;i<a.length-1;i++) {
            for (int k = 0; k < a.length-1-i;k++) {
                if (a[k] > a[k + 1]) {
                    temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                }
            }
        }

                 for(int c:a){
                     System.out.println(c);

                 }
    }
}
