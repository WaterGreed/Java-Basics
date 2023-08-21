package com.epam.rd.autotasks;

import java.util.ArrayList;

public class TaskCarousel {
    private int capacity;
    private ArrayList<Task> tasks = new ArrayList<>();
    private int currentArrayPosition;

    public TaskCarousel(int capacity) {
        this.capacity = capacity;
    }

    public boolean addTask(Task task) {
        if(tasks.size() != capacity && !task.isFinished()) {
            tasks.add(task);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean execute() {
        if(!tasks.isEmpty()) {
            if(currentArrayPosition < tasks.size()) {
                Task task = tasks.get(currentArrayPosition);
                task.execute();
                if(!task.isFinished()) {
                    currentArrayPosition++;
                }
                else {
                    tasks.remove(currentArrayPosition);
                }
                return true;
            }
            else {
                currentArrayPosition = 0;
                return execute();
            }
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if(tasks.size() == capacity) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(tasks.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
