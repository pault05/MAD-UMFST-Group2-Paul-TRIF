public class Car
{
    private int speed;
    private double regularPrice;
    private String color;

    public double SalePrice() { return regularPrice; }

    public int getSpeed()  {return speed;}
    public double getRegularPrice()  {return regularPrice;}
    public String getColor() {return color;}

    public void setSpeed(int speed) {this.speed=speed;}
    public void setRegularPrice(double regularPrice) {this.regularPrice=regularPrice;}
    public void setColor(String color) {this.color = color;}

    public Car(int speed, double regularPrice, String color)
    {
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.color=color;
    }

    public String toString()
    {
        return speed + " " + regularPrice + " " + color;
    }

}
