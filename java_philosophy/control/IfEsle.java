public class IfEsle {
    static int res;
    static void test(int a, int b) {
        if(a > b )
            res=1;
        else if(a<b) res=-1;
        else res = 0;
    }
    public static void main(String[] args){
        test(10, 5);
        System.out.println("res = " + res);
        test(5, 10);
        System.out.println("res = " + res);
        test(5, 5);
        System.out.println("res = " + res);
    }
}
