public class Text {
    public static void main(String[] args) {
        System.out.println(Character.MAX_VALUE);  // ￿
        System.out.println(Character.MIN_VALUE);  // ￿
        System.out.println(new Character('a')); // char 타입은 홑따옴표
        System.out.println("a");  // string 타입은 쌍따옴표
        System.out.println("hello");  // System.out.println(new String("hello"));
        System.out.println(Byte.MAX_VALUE);  // 127
        System.out.println(Byte.MIN_VALUE);  // -128
        byte g = 'g';
        char h = 'h';
        System.out.println(g); // 103
        System.out.println(h); // 104
    }
}
