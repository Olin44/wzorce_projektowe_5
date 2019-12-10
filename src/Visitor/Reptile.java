package Visitor;

public class Reptile extends AnimalImpl {
    public Reptile(String name, Double value, boolean isIll) {
        super(name, value, isIll);
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
