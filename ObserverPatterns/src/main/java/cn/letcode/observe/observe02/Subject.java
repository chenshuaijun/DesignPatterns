package cn.letcode.observe.observe02;


public interface Subject {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObserver();
}
