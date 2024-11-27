public class Main {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "Hello"; //string poolalter

        System.out.println(str1 == str2); // false (str1 to obiekt w heap)
        System.out.println("Hello" == str2);
        System.out.println("Hello" == str1);
    }
}