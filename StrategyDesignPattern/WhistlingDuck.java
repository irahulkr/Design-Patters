package StrategyDesignPattern;

public class WhistlingDuck extends Duck {

    public WhistlingDuck() {
        quackableBehaviour = new Whistle();
        flyableBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am a Whistling Duck");
    }
    
}