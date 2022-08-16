import java.util.Arrays;
import java.util.Collections;

public class Swap {
    public static void main(String[] args) {
        int[] list = new int[]{5,7,11,3,9,2,6};

        for (int i = 0; i < list.length -1; i++) {
            for (int j =i+1; j< list.length;j++){
                // Sap xep tu nho den lon
                if (list[i]>list[j]){
                    int a = list[j];
                    list[j] = list[i];
                    list[i] = a;

                }
                // sap xep tu lon den nho
//                if(list[i]<list[j]){
//                    int a = list[j];
//                    list[j] = list[i];
//                    list[i]= a;
//                }

            }
            display(list);
        }

    }
    public static void display(int [] a){
        for (int i = 0; i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
