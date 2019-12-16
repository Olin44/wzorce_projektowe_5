package Visitor;

class Mammal extends AnimalImpl {

    Mammal(String name, Double value, boolean isIll) {
        super(name, value, isIll);
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit_animal(this);
    }

}
