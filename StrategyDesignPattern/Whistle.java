package StrategyDesignPattern;

public class Whistle implements QuackableBehaviour{
    @Override
    public void quack() {
        System.out.println("Hello!! I whistle");   
    }
}
