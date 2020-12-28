package org.moja.spring.core.di.factory;

public class ATM {

    private Printer printer;

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printedBalancedInformation(String accountNumber){
        getPrinter().printedBalancedInformation(accountNumber);
    }
}
