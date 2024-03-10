
class Letter{
    char c;
}

public class PassObject {
    static void f(Letter l){
        l.c = 'y';
    }
    public static void main(String[] args){
        Letter let = new Letter();
        let.c = 'b';
        System.out.println("let.c = " + let.c);

        f(let);
        System.out.println("let.c = " + let.c);
    }
}
