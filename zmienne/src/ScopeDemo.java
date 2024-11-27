public class ScopeDemo {

    static String globalVariable = "Jestem globalna";

    public static void main(String[] args) {
        String mainVariable = "Jestem lokalna w main";

        System.out.println(mainVariable);
        System.out.println(globalVariable);

        anotherMethod();

//         System.out.println(localVariable);
    }
    public static void anotherMethod() {
        String localVariable = "Jestem lokalna w anotherMethod";

        System.out.println(localVariable);
        System.out.println(globalVariable);
    }

}