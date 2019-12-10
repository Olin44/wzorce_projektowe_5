package Visitor;

public class DarkMarketPriceVisitor implements Visitor{
    private double totalOfficialPrice = 0;

    @Override
    public void visit(Mammal mammal) {
        totalOfficialPrice += mammal.getValue();
    }

    @Override
    public void visit(Reptile reptile) {
        totalOfficialPrice += reptile.getValue();
    }

    @Override
    public void visit(BirdImpl bird) {
        totalOfficialPrice += bird.getDarkMarketValue();
    }

    @Override
    public void visit(Fish fish) {
        totalOfficialPrice += fish.getValue();
    }

    public Double getTotalOfficialPrice(){

        System.out.println("Cena czarnorynkowa");
        return totalOfficialPrice;
    }
}
