class Tree{
    static int higth;
    Tree(){
        System.out.println("Сожаем росток");
        higth = 0;
    }
    Tree(int i){
        higth = i;
        System.out.println("Создание нового дерева высотой " + higth);
    }
    void Info(){
        System.out.println("Дерево высотой " + higth + " м.");
    }
    void Info(String s){
        System.out.println(s + ": Дерево высотой " + higth + " м.");
    }
}

public class Overloading {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            Tree t = new Tree(i);
            t.Info();
            t.Info("Перегруженный метод");
        }
        new Tree();
    }
    
}
