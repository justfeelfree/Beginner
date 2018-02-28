/**
 * @author Kirill Nigmatullin
 */
public class Demo {

    // статическая переменная
    public static String staticName = "i'm a static name";

    // обычная нестатическая переменная
    public String instanceName = "i'm an instance name";


    public static void staticPrint() {
        // вывести статическую переменную из статического метода можно
        System.out.println(staticName);

        // вывести обычную переменную из статического метода нельзя, попробуй раскоментировать и запустить
        // System.out.println(instanceName);

        // запомни ошибку компиляции - non-static variable cannot be referenced from a static context
        // попробуй разобраться, почему работает именно так, объясни свои предположения
        // напиши собственный класс с вызовом статических и нестатических методов, и обращениями к статическим и нестатическим переменным,
    }

    public void instancePrint() {
        // вывести обычную переменную из обычного метода можно
        System.out.println(instanceName);



        // вывести статическую переменную из обычного метода можно
        // System.out.println(staticName);
    }

    public static void main(String[] args) {
        // Задание: ничего не меняя в методах и переменных вызови здесь оба метода staticPrint() и instancePrint()
    }
}
