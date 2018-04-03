package com.egandunning.models;

import com.egandunning.exception.InvalidCentAmountException;

/**
 * A class representing a dollar amount. Floating point numbers can be
 * inaccurate and making sure that monetary calculations are accurate is
 * important, even if it is just for basic bookeeping.
 * @author dunning
 *
 */
public class DollarAmount {

    private int dollars;
    private byte cents;
    
    public DollarAmount(int dollars, byte cents) throws InvalidCentAmountException {
        if(cents > 99) {
            throw new InvalidCentAmountException(cents);
        }
        this.dollars = dollars;
        this.cents = cents;
    }
    
    public DollarAmount(int dollars, int cents) throws InvalidCentAmountException {
        this(dollars, (byte)cents);
    }
}
