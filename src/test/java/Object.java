import java.util.Arrays;

public class Object {
    public static void main(String[] args) {
        String sparta = "Hello We Sparta!!";
        System.out.println(sparta);

        int[] numbers = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        String[] words = new String[] {"HELLO", "안녕", "HI", "NIHAO"};
        System.out.println(Arrays.toString(words));
    }
}
