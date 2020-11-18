package pract11;

public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair() {
        System.out.println("VictorianChair");
        return new VictorianChair(0);
    }

    public MagicChair createMagicChair() {
        System.out.println("MagicChair");
        return new MagicChair();
    }

    public FunctionalChair createFunctionalChair() {
        System.out.println("FunctionalChair");
        return new FunctionalChair();
    }
}
