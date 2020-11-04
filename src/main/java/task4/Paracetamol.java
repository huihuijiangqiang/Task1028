package task4;
//具体产品
public class Paracetamol extends Drug{
    Paracetamol(){
        component="氨加黄敏";
    }

    @Override
    public void drug_content(String s) {
        System.out.println(s+"的成分是"+component);
    }
}
