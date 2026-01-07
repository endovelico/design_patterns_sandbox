package com.dp.sandobx.creational.singleton;


// ===== Client =====
class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.doSomething();
        s2.doSomething();

        System.out.println(s1 == s2); // true, both references point to the same instance
    }
}