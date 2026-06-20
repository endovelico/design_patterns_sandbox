package com.dp.sandobx.other.delegate;

public class DelegateTwo {

    DelegateOne delOne = new DelegateOne();

    public void doSomething() {
        delOne.do_something();
    }
}
