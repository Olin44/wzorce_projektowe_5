package Visitor;

public class OfficialPriceVisitor implements Visitor {

    private double totalOfficialPrice = 0;

    @Override
    public void visit_animal(Animal animal) {
        totalOfficialPrice += animal.getValue();
    }

    @Override
    public void visit_bird(Bird bird) {
        totalOfficialPrice += bird.getValue();
    }

    Double getTotalOfficialPrice(){
        System.out.println("Cena oficjalna");
        return totalOfficialPrice;
    }
}

