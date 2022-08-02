package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator
{
    public BigDecimal add(BigDecimal a, BigDecimal b)
    {
        return a.add(b);
    }

    public BigDecimal minus(BigDecimal a,BigDecimal b)
    {
        return a.add(b.negate());
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b)
    {
        return a.multiply(b);
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b)
    {
        return a.divide(b, RoundingMode.HALF_UP) ;
    }
}
