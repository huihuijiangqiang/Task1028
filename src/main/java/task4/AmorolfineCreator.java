package task4;
//具体构造者
public class AmorolfineCreator extends Creator {
    @Override
    public Drug getDrug() {
        return new Amorolfine();
    }
}
