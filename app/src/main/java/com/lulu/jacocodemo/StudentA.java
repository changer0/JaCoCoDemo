package com.lulu.jacocodemo;

/**
 * @author zhanglulu
 */
public class StudentA {

    private String name;

    public void action(String msg) {
        //触发行为
        System.out.println(msg);
    }

    public class StudentAChild {
        public void action(String msg) {
            //触发行为
            System.out.println(msg);
        }
    }
}
