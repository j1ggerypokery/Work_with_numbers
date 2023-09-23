import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StreamMain streamMain = new StreamMain();
        System.out.println(streamMain.result);

        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        Arrays.sort(input);
        for (int i : input) {
            if (i > 0) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}