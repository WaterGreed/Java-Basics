package com.epam.rd.autotasks;

public class CountDownTask implements Task{
    private int currentValue;
    private boolean isFinished;

    public CountDownTask(int value) {
        if(value > 0) {
            this.currentValue = value;
        }
        else {
            isFinished = true;
        }
    }

    public int getValue() {
        return currentValue;
    }


    @Override
    public void execute() {
        if(!isFinished) {
            currentValue--;
            if(currentValue == 0) {
                isFinished = true;
            }
        }
    }

    @Override
    public boolean isFinished() {
        return isFinished;
    }
}
