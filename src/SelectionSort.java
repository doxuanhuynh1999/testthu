public class SelectionSort {
    public static void main(String[] args) {
        int[] list = new int[]{5,6,2,7,9};
        for (int i = 0; i < list.length-1;i++){
            int minIndex = i;
            // tim gia vi tri nho nhat
            for (int j = i+1; j < list.length; j++){
                if(list[minIndex] > list[j]){
                    minIndex = j;
                }
            }
            // thuc hien swap
                int a = list[minIndex];
                list[minIndex]=list[i];
                list[i]=a;
               display(list);

        }

    }
    public static void swap(int a, int b) {

    }
    public static void display(int [] a){
        for (int i = 0; i < a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
