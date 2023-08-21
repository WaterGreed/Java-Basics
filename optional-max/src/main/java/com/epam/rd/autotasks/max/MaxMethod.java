package com.epam.rd.autotasks.max;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt optionalInt;
        if(values != null && values.length != 0) {
            optionalInt = Arrays.stream(values).max();
        }
        else {
            optionalInt = OptionalInt.empty();
        }
        return optionalInt;
    }
}
