package StrategyDesignPattern;

public class FlyNoWay implements FlyableBehaviour {

    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
    
}
