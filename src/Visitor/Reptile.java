package Visitor;

public class Reptile extends AnimalImpl {

    Reptile(String name, Double value, boolean isIll) {
        super(name, value, isIll);
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit_animal(this);
    }

}
