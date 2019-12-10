package Visitor;

interface Visitor {
    void visit(BirdImpl bird);
    void visit(Fish fish);
    void visit(Mammal mammal);
    void visit(Reptile reptile);
}
