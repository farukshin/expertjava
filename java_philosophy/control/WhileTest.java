
public class WhileTest {
    static int n = 0;
    static boolean condition(){
        boolean res = Math.random() < 0.99;
        System.out.println(res + ", ");
        n++;
        return res;
    }
    public static void main(String[] args){
        while(condition())
            System.out.println("Inside 'while', n = " + n);
        System.out.println("Outside 'while'");
    }
    
}
