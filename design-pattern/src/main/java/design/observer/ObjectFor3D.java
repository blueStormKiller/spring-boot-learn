package design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName ObjectFor3D.java
 * @Description TODO
 * @createTime 2021年12月09日 15:15:00
 */
public class ObjectFor3D implements Subject {
    private List<Observer> observers = new ArrayList<>();

    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserver();
    }
}
