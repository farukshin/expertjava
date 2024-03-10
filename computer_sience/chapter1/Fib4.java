public class Fib4 {
    private static int fib4(int n){
        int last =0, next = 1;
        for(int i=0;i<n;i++){
            int oldLast = last;
            last = next;
            next = oldLast + last;
        }
        return last;
    }
    public static void main(String[] args){
        System.out.println(fib4(10));
        System.out.println(fib4(40));
    }
}
