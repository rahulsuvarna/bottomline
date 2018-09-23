package com.bottomline.service.print;

import java.math.BigDecimal;

/**
 * This Service is responsible to print the message to the console.
 */
public class ConsolePrintService implements PrintService {

    @Override
    public void print(String message, BigDecimal anAmount) {

        System.out.printf(message, anAmount);

    }
}
