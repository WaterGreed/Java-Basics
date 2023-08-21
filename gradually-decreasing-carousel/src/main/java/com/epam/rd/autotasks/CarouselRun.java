package com.epam.rd.autotasks;

import java.util.ArrayList;

public class CarouselRun {
    private final ArrayList<Integer> CAROUSEL_ELEMENTS;
    private int counter;
    private boolean isFinished;

    public CarouselRun (ArrayList<Integer> carouselElements) {
        this.CAROUSEL_ELEMENTS = carouselElements;
        isFinished = isCarouselElementsEmpty();
    }

    public int next() {
        if (isFinished) {
            return -1;
        }
        if (counter >= CAROUSEL_ELEMENTS.size()) {
            newArrayPass();
        }
        int currentElement = CAROUSEL_ELEMENTS.get(counter);
        int reducedElement = ReduceElement(currentElement);
        CAROUSEL_ELEMENTS.set(counter, reducedElement);
        if (reducedElement > 0) {
            counter++;
        }
        else {
            CAROUSEL_ELEMENTS.remove(counter);
            isFinished = isCarouselElementsEmpty();
        }
        return currentElement;
    }

    public boolean isFinished() {
        return isFinished;
    }

    private boolean isCarouselElementsEmpty() {
        return CAROUSEL_ELEMENTS.isEmpty();
    }

    protected int ReduceElement(int elementToReduce) {
        return elementToReduce - 1;
    }

    protected void newArrayPass() {
        counter = 0;
    }
}
