package DecoratorPattern;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car basicCar) {
        super(basicCar);
    }
    @Override
    public void assemble(){
        basicCar.assemble();
        setLuxury(basicCar);
    }

    public void setLuxury(Car basicCar){
        System.out.print("Adding features of Luxury Car. ");
    }
}
