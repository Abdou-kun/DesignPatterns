import com.duckapp.client.*;
import com.duckapp.flybehavior.*;
import com.duckapp.quackbehavior.*;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new RedDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Quack());
        mallard.performFly();
        mallard.performQuack();
    }
}