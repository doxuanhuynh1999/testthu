public class InsertionSort {
    public static void main(String[] args) {
        int[] list = new int[]{1,8,6,2,9,7,5};
        for (int i = 1; i < list.length;i++){
            // nhac quan bai len
            int tmp = list[i];
            int j = i -1;
            // tim ra vi tri chinh xac de chen
            while (j>=0 && tmp < list[j]){
                list[j+1]=list[j];
                j--;
            }
            // chen quan bai da nhac vaoo vi tri da tim
            list[j+1] = tmp;
            display(list);
        }
        display(list);

    }
    public static void display(int[]a){
        for (int i =0; i< a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
