import java.util.Scanner;
public class Retail {
    public static void main(String... args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("enter the product number");
        int productNum = s.nextInt();
        int quansold = s.nextInt();
        Retail st = new Retail();
        st.productprice(productNum, quansold);
    }

    public void productprice(int productnum, int quansold) {
        double retprice = 0.0;

        switch (productnum) {
            case 1:
                retprice = quansold * 22.50;
                break;
            case 2:
                retprice = quansold * 44.50;
            case 3:
                retprice = quansold * 9.98;
                break;
            default:
                System.out.println("enter wrong productnum");
        }
        System.out.println("the retailprice is" + retprice);
    }
}
