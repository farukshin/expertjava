public class Burrito {
    Spiciness degree;
    Burrito(Spiciness sp){
        this.degree = sp;
    }
    public void describe(){
        System.out.print("This burrito is ");
        switch (degree){
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
                System.out.println("maybe too hot.");
        }
    }
    public static void main(String[] args){
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.NOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
