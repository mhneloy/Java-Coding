package Methods;

public class PassingArgument {
    public static void greet (String name){
        System.out.println("Good Morning " + name);
    }

    static void main() {
        greet("Father");
        sum(2,8);
        intro("Mahmudul", 26);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void intro(String name, int age){
        System.out.println("Hello "+ name + " Your age is "+age);
    }
}
