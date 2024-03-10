class Bird2{
    Bird2(int i){}
    Bird2(double e){}
}

public class NoSynthesis {
    public static void main(String[] ards){
        //Bird2 b1 = new Bird2();
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
    }
}