public class Main {
    public static void main(String[] args)
    {
        Sedan s = new Sedan(200, 30000, "yellow", 2000);

        System.out.println(s.SalePrice());

        Ford f1 = new Ford(180, 25000, "red", 2018, 1000);
        Ford f2 = new Ford(150, 20000, "green", 2024, 5000);

        System.out.println(f1.SalePrice());
        System.out.println(f2.SalePrice());

        Car c = new Car(290, 67000, "aurora blue");

        System.out.println(c.SalePrice());

    }
}