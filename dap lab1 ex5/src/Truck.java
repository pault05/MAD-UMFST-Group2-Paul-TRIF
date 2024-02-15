public class Truck extends Car
{
    private final int weight;
    public Truck(int speed, double regularPrice, String color, int weight)
    {
        super(speed, regularPrice, color);
        this.weight=weight;
    }

    @Override
    public double SalePrice()
    {
        double newPrice;
        if(this.weight > 2000)
        {
            newPrice = super.getRegularPrice() - super.getRegularPrice() * 0.1;
        }
        else
        {
            newPrice = super.getRegularPrice() - super.getRegularPrice() * 0.2;
        }
        this.setRegularPrice(newPrice);
        return newPrice;
    }

}
