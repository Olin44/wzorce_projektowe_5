package Visitor;

class Mammal extends AnimalImpl {
    public Mammal(String name, Double value, boolean isIll) {
        super(name, value, isIll);
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
