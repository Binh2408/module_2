package ss11_dsa_stack_queue.bai_tap.bai_2_dem_so_lan_xuat_hien_moi_tu_su_dung_treemap;

import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        String input = "Bình Chung Khánh Đông Bình Chung Khánh Đông Bình Chung Khánh Đông".toLowerCase().trim();
        String[] list = input.split(" ");
        TreeMap<String, Integer> word = new TreeMap<>();
        for (int i = 0; i < list.length; i++) {
            if (word.containsKey(list[i])) {
                word.put(list[i], word.get(list[i]) + 1);
            } else {
                word.put(list[i], 1);
            }
        }
        for (String key : word.keySet()) {
            System.out.println(key + ": " + word.get(key));
        }
    }
}
