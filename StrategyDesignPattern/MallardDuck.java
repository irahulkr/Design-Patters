package StrategyDesignPattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackableBehaviour = new Quack();
        flyableBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }
    
}
