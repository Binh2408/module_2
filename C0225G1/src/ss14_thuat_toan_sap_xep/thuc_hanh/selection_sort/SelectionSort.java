package ss14_thuat_toan_sap_xep.thuc_hanh.selection_sort;

public class SelectionSort {
    public static void selectionSort(int[] array){
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,4,9,10,1,-10,-5};
        selectionSort(array);
        for(int value: array){
            System.out.print(value + " ");
        }
    }
}
