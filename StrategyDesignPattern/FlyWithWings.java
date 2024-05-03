package StrategyDesignPattern;

public class FlyWithWings implements FlyableBehaviour{

    @Override
    public void fly() {
        System.out.println("I can fly with my wings");
    }
    
}
