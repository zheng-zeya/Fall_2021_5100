package DecoratorPattern;

public abstract class CarDecorator implements Car {
    protected Car basicCar = null;

    public CarDecorator(Car basicCar){
        this.basicCar = basicCar;
    }

    public void assemble() {
        basicCar.assemble();
    }

}
