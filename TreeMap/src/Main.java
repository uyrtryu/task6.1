import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static int[] asd(int[] a) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - MyTreeMap. 2 - TreeMap");
        int n = scanner.nextInt();

        Map<Integer, Integer> treeMap = null;

        if (n == 2) {
            treeMap = new TreeMap<>();
        } else if (n == 1) {
            treeMap = new AVLTreeMap<>();

        }


        for (int num : a) {
            if (treeMap.containsKey(num)) {
                treeMap.put(num, treeMap.get(num) + 1);
            } else {
                treeMap.put(num, 1);
            }
        }
        int chet = -1;
        for (Map.Entry<Integer, Integer> map : treeMap.entrySet()) {
            if (map.getValue() > 1) {

                int amount = 1;
                while (map.getValue() >= amount) {

                    chet++;
                    a[chet] = map.getKey();
                    amount++;

                }
            }else {
                chet++;
                a[chet] = map.getKey();
            }

        }
        return a;
    }

    public static void main(String[] args) {


        int[] array = {5, 3, 23, 67, 745, 24, 12, 1, 6, 234, 1, 64, 7, 745};
        array = asd(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}