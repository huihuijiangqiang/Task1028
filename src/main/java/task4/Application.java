package task4;

/**
 *        PenCore penCore;
 *        BallPen ballPen=new BlueBallPen();
 *        penCore=ballPen.getPenCore();
 *        penCore.writeWord("你好,很高兴认识你");
 *        ballPen=new RedBallPen();
 *        penCore=ballPen.getPenCore();
 *        penCore.writeWord("How are you");
 *        ballPen=new BlackBallPen();
 *        penCore=ballPen.getPenCore();
 *        penCore.writeWord("nice to meet you");
 */
public class Application {
    public static void main(String[] args) {
        Drug drug;
        Creator creator=new AmorolfineCreator();
        drug= creator.getDrug();
        drug.drug_content("Amorolfine");
        creator = new ParacetamolCreator();
        drug=creator.getDrug();
        drug.drug_content("Paracetamol");
    }
}
