package com.epam.rd.autotasks;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    private int reducer = 1;

    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    protected CarouselRun getCarouselRun() {
        return new CarouselRun(CAROUSEL_ELEMENTS) {
            protected int ReduceElement(int elementToReduce) {
                return elementToReduce - reducer;
            }

            @Override
            protected void newArrayPass() {
                super.newArrayPass();
                reducer++;
            }
        };
    }
}
