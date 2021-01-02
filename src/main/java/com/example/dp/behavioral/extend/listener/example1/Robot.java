package com.example.dp.behavioral.extend.listener.example1;

public class Robot {
    private RobotListener robotListener;

    public void registerListener(RobotListener robotListener) {
        this.robotListener = robotListener;
    }

    public void working() {
        if (robotListener != null) {
            Even even = new Even(this);
            this.robotListener.working(even);
        }
        System.out.println("机器人开始工作");
    }

    public void dancing() {
        if (robotListener != null) {
            Even even = new Even(this);
            this.robotListener.dancing(even);

        }
        System.out.println("机器人开始跳舞......");
    }


}
