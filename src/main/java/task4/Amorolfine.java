package task4;
//具体产品
public class Amorolfine extends Drug {
    Amorolfine(){
        component="盐酸阿莫罗分";
    }
    @Override
    public void drug_content(String s) {
        System.out.println(s+"的成分是"+component);
    }
}
