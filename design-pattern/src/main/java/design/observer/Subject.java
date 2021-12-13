package design.observer;


/**
 * 定义了对象之间的一对多的依赖，这样一来，当一个对象改变时，它的所有的依赖者都会收到通知并自动更新
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 方法描述:通知所有的观察者
     *
     * @param
     * @return
     **/
    public void notifyObserver();
}
