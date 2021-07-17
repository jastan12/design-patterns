package Observer;

public class Client1 implements Observer {
    @Override
    public void update() {
        System.out.println("Work done + " + this.getClass().getName());
    }
}
