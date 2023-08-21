package com.epam.rd.autotasks;

import java.util.ArrayList;

public class DecrementingCarousel {
    private ArrayList<Integer> carouselElements = new ArrayList<Integer>();
    private int maxAmountOfElements;

    private boolean isRunWasCalled;

    public DecrementingCarousel (int capacity) {
        this.maxAmountOfElements = capacity;
    }

    public boolean addElement (int element) {
        if (element > 0 && !isRunWasCalled && carouselElements.size() < maxAmountOfElements) {
            carouselElements.add(element);
            return true;
        }
        else {
            return false;
        }
    }

    public CarouselRun run () {
        if (!isRunWasCalled) {
            isRunWasCalled = true;
            return new CarouselRun(carouselElements);
        }
        else {
            return null;
        }
    }
}
