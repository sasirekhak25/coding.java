import java.util.Scanner;

public class RetailOne {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the product number");
        int productnum = s.nextInt();
        int quansold = s.nextInt();
        RetailOne st = new RetailOne();
        st.productprice(productnum, quansold);
    }

    public void productprice(int productnum, int quansold) {
        double retprice = 0.0;

        switch (productnum) {
            case 1:
                retprice = productnum * 22.50;
                break;
            case 3:
                retprice = productnum * 44.50;
                break;
            default:
                System.out.println("enter wrong productnum");
        }
        System.out.println("the retailprice is" + retprice);
    }
}
