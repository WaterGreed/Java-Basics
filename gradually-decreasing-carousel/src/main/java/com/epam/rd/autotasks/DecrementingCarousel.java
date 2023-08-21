package com.epam.rd.autotasks;

import java.util.ArrayList;

public class DecrementingCarousel {
    protected final ArrayList<Integer> CAROUSEL_ELEMENTS = new ArrayList<>();
    private final int MAX_AMOUNT_OF_ELEMENTS;

    private boolean isRunWasCalled;

    public DecrementingCarousel (int capacity) {
        this.MAX_AMOUNT_OF_ELEMENTS = capacity;
    }

    public boolean addElement (int element) {
        if (element > 0 && !isRunWasCalled && CAROUSEL_ELEMENTS.size() < MAX_AMOUNT_OF_ELEMENTS) {
            CAROUSEL_ELEMENTS.add(element);
            return true;
        }
        else {
            return false;
        }
    }

    public CarouselRun run () {
        if (!isRunWasCalled) {
            isRunWasCalled = true;
            return getCarouselRun();
        }
        else {
            return null;
        }
    }

    protected CarouselRun getCarouselRun() {
        return new CarouselRun(CAROUSEL_ELEMENTS);
    }

}
