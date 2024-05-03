package StrategyDesignPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performQuack();
        mallardDuck.perfromFly();
        mallardDuck.setQuackBehaviour(new Whistle());
        mallardDuck.performQuack();
        mallardDuck.setFlyBehaviour(new FlyNoWay());
        mallardDuck.perfromFly();
        
        System.out.println("---------------------------");

        Duck whistleDuck = new WhistlingDuck();
        whistleDuck.display();
        whistleDuck.swim(); 
        whistleDuck.performQuack();
        whistleDuck.perfromFly();
        whistleDuck.setQuackBehaviour(new Quack());
        whistleDuck.performQuack();
        whistleDuck.setFlyBehaviour(new FlyWithWings());
        whistleDuck.perfromFly();
    }
}
