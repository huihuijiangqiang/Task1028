package task4;
//构造者（Creator）
public abstract class Creator {
    Creator(){
        System.out.println("生产了含量为"+getDrug().component+"的药品");
    }
    public abstract Drug getDrug();
}
