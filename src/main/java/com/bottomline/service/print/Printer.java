package com.bottomline.service.print;

import java.math.BigDecimal;

public abstract class Printer {

    public void print(final String message, final BigDecimal anAmount) {
        final PrintService print = getPrinter();

        print.print(message, anAmount);
    }

    protected abstract PrintService getPrinter();
}
