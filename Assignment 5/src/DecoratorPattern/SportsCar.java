package DecoratorPattern;

public class SportsCar extends CarDecorator{
    public SportsCar(Car basicCar) {
        super(basicCar);
    }

    @Override
    public void assemble(){
        basicCar.assemble();
        setSports(basicCar);
    }

    public void setSports(Car basicCar){
        System.out.print("Adding features of Sports Car. ");
    }
}
