package ss14_thuat_toan_sap_xep.bai_tap.bai_2_setting_insertion_sort;

public class InsertionSortSetting {
    public static void insertionSortSetting(int[] array){
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
        int[] arr = {9, 5, 1, 4, 3};
        System.out.println("Mảng trước khi sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionSortSetting(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
