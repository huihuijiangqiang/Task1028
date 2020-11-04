package task4;
//具体构造者
public class ParacetamolCreator extends Creator {
    @Override
    public Drug getDrug() {
        return new Paracetamol();
    }
}
