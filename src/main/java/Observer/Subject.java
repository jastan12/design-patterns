package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers;

    Subject(){
        this.observers = new ArrayList<>();
    }

    public void startWork(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (Observer observer : observers) {
                    observer.update();
                }
            }
        });
        thread.start();
    }

    public void subscribe(Observer observer){
        observers.add(observer);
    }
}
