public class URShift {
    public static void main(String[] args){
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i>>>=10;
        System.out.println(Integer.toBinaryString(i));
        long ll = -1;
        //System.out.println(Integer.toBinaryString(ll)); // todo
        ll >>>= 10;
        //System.out.println(Integer.toBinaryString(ll));
        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        s>>>=10;
        System.out.println(Integer.toBinaryString(s));
        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        b>>>=10;
        System.out.println(Integer.toBinaryString(b));
        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>10));
    }
    
}
