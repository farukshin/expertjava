class Values{
    int a;
}

public class EqualsMethod2 {
    public static void main(String[] args){
        Values v1 = new Values();
        Values v2 = new Values();
        v1.a = v2.a = 5;
        System.out.println(v1.equals(v2));
    }
}