public class Flower {
    int petalCount = 0;
    String s = "initioal value";
    Flower(int petals){
        petalCount = petals;
        System.out.println("конструктор с параметром int, petalCount = " + petalCount);
    }
    Flower(String ss){
        System.out.println("конструктор с параметром String, s = " + ss);
        s = ss;
    }
    Flower(String ss, int petals){
        this(petals);
        //this(ss);
        this.s = ss;
        System.out.println("аргументы String и int");
    }
    Flower(){
        this("hi", 47);
        System.out.println("Конструктор по умолчанию без агрументов");
    }
    void printPetalCount(){
        System.out.println("petalCount = " + petalCount  + ", s = " + s);
    }
    public static void main(String[] args){
        Flower x = new Flower();
        x.printPetalCount();
    }
}
