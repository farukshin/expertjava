public class OverloadingOrder {
    static void f(String s, int n){
        System.out.println(s + " " + n);
    }
    static void f(int n, String s){
        System.out.println(n + " "+ s);
    }
    public static void main(String[] args){
        f("Сначало строка", 10);
        f(10, "Сначало число");
    }
}
