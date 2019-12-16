package Visitor;

abstract class AnimalImpl implements Animal {
    String name;
    Double value;
    boolean isIll;

    AnimalImpl(String name, Double value, boolean isIll) {
        this.name = name;
        this.value = value;
        this.isIll = isIll;
    }

    @Override
    public abstract void accept(Visitor visitor);


    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public boolean isIll() {
        return isIll;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "{name='" + name + '\'' +
                ", value=" + value +
                ", isIll=" + isIll +
                '}';
    }
}
