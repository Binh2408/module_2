package ss14_thuat_toan_sap_xep.bai_tap.bai_1_minh_hoa_insertion_sort;

public class InsertionSort {
    public static void insertionSort(int[] array){
        int pos, x;
        for (int i = 1; i < array.length ; i++) {
            x = array[i];
            pos = i;
            boolean isSwapped = false;
            while (pos > 0 && x < array[pos - 1]){
                System.out.println("Swap "+ array[pos] + " with " + array[pos-1]);
                array[pos] = array[pos - 1];
                pos--;
                isSwapped = true;
            }
            array[pos] = x;
            if (!isSwapped) {
                System.out.println("Không cần đổi chỗ ở bước " + i + ", mảng không thay đổi");
            }
            System.out.print("Mảng sau bước " + i + ": ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,4,9,10,1,-10,-5};
        System.out.println("Mảng trước khi sắp xếp: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        insertionSort(array);
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
