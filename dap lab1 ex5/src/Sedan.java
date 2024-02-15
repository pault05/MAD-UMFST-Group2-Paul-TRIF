public class Sedan extends Car
{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length)
    {
        super(speed, regularPrice, color);
        this.length=length;
    }

    @Override
    public double SalePrice()
    {
        double newPrice;

        if(this.length > 20)
        {
            newPrice = super.getRegularPrice() - super.getRegularPrice()*0.05;
        }
        else
        {
            newPrice = super.getRegularPrice() - super.getRegularPrice()*0.1;
        }
        this.setRegularPrice(newPrice);
        return newPrice;
    }
}
