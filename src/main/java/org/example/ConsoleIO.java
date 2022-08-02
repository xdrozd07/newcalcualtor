package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConsoleIO
{
    private final Scanner scanner;

    public ConsoleIO() {
        scanner = new Scanner(System.in);
    }


    public BigDecimal readNumber()
    {
        if (scanner.hasNextBigDecimal())
        {
            return scanner.nextBigDecimal();
        }
        throw new NumberFormatException();
    }

    public String readOperation()
    {
        if (scanner.hasNext()) {
            return scanner.next();
        }
       throw new IllegalArgumentException();

    }
    public void writeString(String output)
    {
        System.out.println(output);
    }
}
