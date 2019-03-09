package cn.letcode.observe.observer02;


public interface Subject {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObserver();
}
