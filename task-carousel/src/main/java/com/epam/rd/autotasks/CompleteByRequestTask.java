package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
    private boolean isCompleted;
    private boolean isFinished;

    @Override
    public void execute() {
        if(isCompleted) {
            isFinished = true;
        }
    }

    @Override
    public boolean isFinished() {
        return isFinished;
    }

    public void complete() {
        isCompleted = true;
    }
}
