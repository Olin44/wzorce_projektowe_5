package Visitor;

public class BirdImpl extends AnimalImpl implements Bird{
    private Double darkMarketValue;

    public BirdImpl(String name, Double value, boolean isIll, Double darkMarketValue) {
        super(name, value, isIll);
        this.darkMarketValue = darkMarketValue;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Double getDarkMarketValue() {
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
