package Visitor;

public class OfficialPriceVisitor implements Visitor {

    private double totalOfficialPrice = 0;

    @Override
    public void visit(BirdImpl bird) {
        totalOfficialPrice += bird.getValue();
    }

    @Override
    public void visit(Mammal mammal) {
        totalOfficialPrice += mammal.getValue();
    }

    @Override
    public void visit(Fish fish) {
        totalOfficialPrice += fish.getValue();
    }

    @Override
    public void visit(Reptile reptile) {
        totalOfficialPrice += reptile.getValue();
    }

    public Double getTotalOfficialPrice(){
        System.out.println("Cena oficjalna");
        return totalOfficialPrice;
    }
}

