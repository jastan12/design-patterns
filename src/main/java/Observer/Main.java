package Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.subscribe(new Client1());
        subject.subscribe(new Client2());
        subject.startWork();
    }
}
