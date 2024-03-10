class Roc{
    Roc(int n){
        System.out.print("Roc " + n + " ");
    }
}
public class SimpleConstructor2 {
    public static void main(String[] args){
        for(int i=0;i<10;i++)
            new Roc(i+1);
    }
}
