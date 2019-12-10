package Visitor;

public interface Animal {
    boolean isIll();
    Double getValue();
    void accept(Visitor visitor);
}
