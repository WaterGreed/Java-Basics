package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {
    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    protected CarouselRun getCarouselRun() {
        return new CarouselRun(carouselElements) {
            protected int ReduceElement(int elementToReduce) {
                return elementToReduce / 2;
            }
        };
    }

}
