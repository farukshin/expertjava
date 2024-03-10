import java.util.*;

public class Tasks {
    private int n;
    private char ch;

    public static void main(String[] args){
        Tasks t = new Tasks();
        t.solve1();
        t.solve2();
        t.solve3();
        t.solve4();
    }

    public void solve1(){
        System.err.printf("Переменная n: %d\n", this.n);
        System.err.printf("Переменная ch: %c\n", this.ch);        
    }

    public void solve2(){
        System.err.printf("Привет, мир!\n");
    }

    public void solve3(){
        ATypeName a = new ATypeName();
        a.sey();
    }

    public void solve4(){
        DataOnly d = new DataOnly();
        d.b = true;
        d.d = 1.16;
        d.i = 116;        
    }

    public void solve5(){
        DataOnly d = new DataOnly();
        d.b = true;
        d.d = 1.16;
        d.i = 116;
        System.out.printf("DataOnly class i=%d d=%f b=%b\n", d.i, d.d, d.b);
    }

    public void solve6(){
        DataOnly d = new DataOnly();
        d.b = true;
        d.d = 1.16;
        d.i = 116;
        System.out.printf("DataOnly class i=%d d=%f b=%b\n", d.i, d.d, d.b);
    }

    private int storage(String s){
        return 5;
    }
}
