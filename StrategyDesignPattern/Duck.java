package StrategyDesignPattern;

public abstract class Duck {
    QuackableBehaviour quackableBehaviour;
    FlyableBehaviour flyableBehaviour;

    public abstract void display();

    public Duck() {}

    public void setQuackBehaviour(QuackableBehaviour quackableBehaviour) {
        this.quackableBehaviour = quackableBehaviour;
    }

    public void setFlyBehaviour(FlyableBehaviour flyableBehaviour) {
        this.flyableBehaviour = flyableBehaviour;
    }

    public void performQuack() {
        quackableBehaviour.quack();
    }

    public void perfromFly() {
        flyableBehaviour.fly();
    }

    public void swim() {
        System.out.println("I can swim");
    }
}