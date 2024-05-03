package StrategyDesignPattern;

public class Quack implements QuackableBehaviour{
    @Override
    public void quack() {
        System.out.println("Hello!! I quack");   
    }
}
