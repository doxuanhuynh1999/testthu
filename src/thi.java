import java.util.ArrayList;
import java.util.Scanner;

public class thi {
    public static void main(String[] args) {
        int BCNN;
        int r;
        int m,n;

        do {
            Scanner sc = new Scanner(System.in);

             do {
                 System.out.print("nhap m : ");
                 m = sc.nextInt();
                 System.out.print("nhap n : ");
                 n = sc.nextInt();
                 r = m % n;
             }while (m<n);
            if (!(r==0)){
                m = n;
                n = r;
                r = m % n;
            }
            System.out.println("BCNN "  + n);

        }while (!(r == 0));


    }

}
