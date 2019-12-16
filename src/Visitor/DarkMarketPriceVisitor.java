package Visitor;

public class DarkMarketPriceVisitor implements Visitor{
    private double totalOfficialPrice = 0;

    @Override
    public void visit_animal(Animal animal) {
        totalOfficialPrice += animal.getValue();
    }

    @Override
    public void visit_bird(Bird bird) {
        totalOfficialPrice += bird.getDarkMarketValue();
    }

    Double getTotalOfficialPrice(){
        System.out.println("Cena czarnorynkowa");
        return totalOfficialPrice;
    }
}
