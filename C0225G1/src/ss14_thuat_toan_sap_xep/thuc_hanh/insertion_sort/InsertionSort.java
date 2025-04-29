package ss14_thuat_toan_sap_xep.thuc_hanh.insertion_sort;

public class InsertionSort {
    public static void insertionSort(int[] array){
        int pos, x;
        for (int i = 1; i < array.length ; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]){
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,4,9,10,1,-10,-5};
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
