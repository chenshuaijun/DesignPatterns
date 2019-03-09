package cn.letcode.observe.observe01;

import java.util.ArrayList;
import java.util.List;

public class SeekJobCenter implements Subject {
    String mess;
    boolean changed;
    List<Observer> personList;

    public SeekJobCenter() {
        personList = new ArrayList<Observer>();
        mess = "";
        changed = false;
    }

    @Override
    public void addObserver(Observer o) {
        if (!personList.contains(o))
            personList.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        if (personList.contains(o))
            personList.remove(o);
    }

    @Override
    public void notifyObserver() {
        if (changed) {
            for (Observer o : personList) {
                o.hearTelephone(mess);
            }
        }
        changed = false;
    }

    public void giveNewMess(String str) {
        if (str.equals(mess)) {
            changed = false;
        } else {
            mess = str;
            changed = true;
        }
    }
}
