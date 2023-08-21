package com.epam.rd.autotasks;

import java.util.ArrayList;

public class CarouselRun {
    private ArrayList<Integer> carouselElements;
    private int counter;
    private boolean isFinished;

    public CarouselRun (ArrayList<Integer> carouselElements) {
        this.carouselElements = carouselElements;
        isFinished = isCarouselElementsEmpty();
    }

    public int next() {
        if (isFinished) {
            return -1;
        }
        if (counter >= carouselElements.size()) {
            counter = 0;
        }
        int currentElement = carouselElements.get(counter);
        int reducedElement = ReduceElement(currentElement);
        carouselElements.set(counter, reducedElement);
        if (reducedElement > 0) {
            counter++;
        }
        else {
            carouselElements.remove(counter);
            isFinished = isCarouselElementsEmpty();
        }
        return currentElement;
    }

    public boolean isFinished() {
        return isFinished;
    }

    private boolean isCarouselElementsEmpty() {
        return carouselElements.isEmpty();
    }

    protected int ReduceElement(int elementToReduce) {
        return elementToReduce - 1;
    }
}