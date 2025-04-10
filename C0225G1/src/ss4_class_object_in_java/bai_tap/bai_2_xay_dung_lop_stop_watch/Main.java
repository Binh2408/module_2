package ss4_class_object_in_java.bai_tap.bai_2_xay_dung_lop_stop_watch;

public class Main {
    public static void main(String[] args) {
        double[] arrays = new double[100000];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Math.random();
        }
        StopWatch watch = new StopWatch();
        watch.start();
        selectionSort(arrays);
        watch.stop();
        System.out.println("Thời gian thực thi: " + watch.getElapsedTime() + " ms");
    }
    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên chưa sắp xếp
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
