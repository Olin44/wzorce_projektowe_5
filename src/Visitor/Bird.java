package Visitor;

public class Bird extends AnimalImpl{
    private Double darkMarketValue;

    Bird(String name, Double value, boolean isIll, Double darkMarketValue) {
        super(name, value, isIll);
        this.darkMarketValue = darkMarketValue;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit_bird(this);
    }

    Double getDarkMarketValue() {
        return darkMarketValue;
    }

    @Override
    public String toString() {
        return this.getClass().getName().replaceAll("Impl", "") + "{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", isIll=" + isIll +
                ", darkMarketValue=" + darkMarketValue +
                '}';
    }
}
