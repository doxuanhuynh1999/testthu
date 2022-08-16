import java.util.Scanner;

public class tetsBulbal {
    public static void main(String[] args) {
//        int[] list = new int[]{5,7,11,3,9,2,6};
//        for(int i = list.length-1;i>=0;i--){
//            for (int j = 1; j<=i; j++){
//                if (list[j-1]>list[j]){
//                    int tmp = list[j];
//                    list[j] = list[j-1];
//                    list[j-1] = tmp;
//                }
//            }
//            display(list);
//        }
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int n = sc.nextInt();
        int[] list = new int[]{5,7,11,3,9,2,6};
        BubbleSort(list);
    }
    public static void display(int [] a){
        for (int i = 0; i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void BubbleSort(int [] list){
        for(int i = list.length-1;i>=0;i--){
            for (int j = 1; j<=i; j++){
                if (list[j-1]>list[j]){
                    int tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }
            }
            display(list);
        }
    }
}
