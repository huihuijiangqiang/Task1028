package task4;

/**
 *     抽象产品（Product）
 *     创建药品对象：系统设计了一个抽象类Drug，该抽象类特别规定了所创建的药
 *     品必须给出药品的成分及其含量。Drug目前有两个子类：Paracetamol和Amorolfine。
 *     Paracetamol子类负责创建氨加黄敏一类的药品，
 *     Amorolfine子类负责创建盐酸阿莫罗分一类的药品。
 *    一个为某药店开发的应用程序需要使用Drug类的某个子类的
 *    实例为用户提供药品。但是药店的应用程序不能使用Drug的子
 *    类的构造方法直接创建对象，因为药店没有能力给出药品的各个
 *    成分的含量，只有药厂才有这样的能力
 */
public abstract class Drug {
    String component;//药物成分
    public abstract void drug_content(String s);//药物含量
}
