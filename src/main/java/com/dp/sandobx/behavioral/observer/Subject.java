package com.dp.sandobx.behavioral.observer;

// ===== Subject Interface =====
interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}