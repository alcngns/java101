public class Main {
    public static void main(String[] args) {

        int[] list = {1, 24, 47, -54, -67, 42, 17, 100, -87};

        int min = list[0];
        int max = list[0];

        for (int i: list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("MAximum value: " + max);
    }
}