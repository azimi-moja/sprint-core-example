package org.moja.spring.core.di.factory;

public class PrinterFactory {

    public static Printer getPrinter(){
        return new Printer();
    }
}
