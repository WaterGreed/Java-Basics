package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        }
        catch (FileNotFoundException exception) {
            throw (IllegalArgumentException)new IllegalArgumentException("Resource is missing").initCause(exception);
        }
        catch (ArithmeticException | NumberFormatException exception) {
            System.err.println(exception.getMessage());
        }
        catch (IOException exception) {
            throw (IllegalArgumentException)new IllegalArgumentException("Resource error").initCause(exception);
        }
    }
}
