package Visitor;

public class Fish extends AnimalImpl {
    public Fish(String name, Double value, boolean isIll) {
        super(name, value, isIll);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
