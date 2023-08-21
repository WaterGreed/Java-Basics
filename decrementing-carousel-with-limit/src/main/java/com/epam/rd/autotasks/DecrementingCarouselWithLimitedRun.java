package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    private final int MAX_ITERATIONS;
    private int currentAmountOfIterations = 1;

    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.MAX_ITERATIONS = actionLimit;
    }

    protected CarouselRun getCarouselRun() {
        return new CarouselRun(CAROUSEL_ELEMENTS) {
            @Override
            public int next() {
                int valueToReturn = super.next();
                if (currentAmountOfIterations < MAX_ITERATIONS) {
                    currentAmountOfIterations++;
                }
                else {
                    isFinished = true;
                }
                return valueToReturn;
            }
        };
    }
}
