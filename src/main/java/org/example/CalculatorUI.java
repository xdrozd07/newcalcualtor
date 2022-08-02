package org.example;

import java.math.BigDecimal;

public class CalculatorUI {
    private final ConsoleIO consoleIO;
    private final Calculator calculator;

    public CalculatorUI() {
        consoleIO = new ConsoleIO();
        calculator = new Calculator();
    }

    public void run()
    {

        consoleIO.writeString("Zadejte cislo A:");
        BigDecimal a = consoleIO.readNumber();


        consoleIO.writeString("Zadejte cislo B:");
        BigDecimal b = consoleIO.readNumber();

        consoleIO.writeString("Zadajte operaciu  (P)lus, (M)inus, (D)eleno, (N)asobenie");
         String operation = consoleIO.readOperation();
         if (operation.equals("P"))
         {
             consoleIO.writeString("sucet: " + calculator.add(a, b));
         } else if (operation.equals("M")) {

             consoleIO.writeString("rozdiel: " + calculator.minus(a, b));
         } else if (operation.equals("D")) {
             consoleIO.writeString("vydelene: " + calculator.divide(a, b));
         } else if (operation.equals("N")) {
             consoleIO.writeString("vynasabene: " + calculator.multiply(a, b));
         }else {
             consoleIO.writeString("Neznama operacia"
             );
         }



    }
}
