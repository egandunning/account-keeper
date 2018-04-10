package com.egandunning.models;

import com.egandunning.exception.InvalidCentAmountException;

/**
 * A class representing a dollar amount. Floating point numbers can be
 * inaccurate and making sure that monetary calculations are accurate is
 * important, even if it is just for basic bookkeeping.
 * @author dunning
 *
 */
public class DollarAmount {

    private int dollars;
    private byte cents;
    
    public DollarAmount() {
        dollars = 0;
        cents = 0;
    }
    
    public DollarAmount(DollarAmount other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }
    
    public DollarAmount(int dollars) {
        this.dollars = dollars;
    }
    
    public DollarAmount(int dollars, byte cents) {
        if(cents > 99) {
            throw new InvalidCentAmountException(cents);
        }
        this.dollars = dollars;
        this.cents = cents;
    }
    
    public DollarAmount(int dollars, int cents) {
        if(cents > 99) {
            throw new InvalidCentAmountException(cents);
        }
        this.dollars = dollars;
        this.cents = (byte)cents;
    }

    /**
     * Add other dollar amount to this dollar amount.
     * @param other the amount to add. 
     * @return reference to this dollar amount.
     */
    public DollarAmount add(DollarAmount other) {
        
        //sum is guaranteed not to overflow, as cents is 99 or less
        byte cents = (byte) (this.cents + other.cents);
        
        int dollars = this.dollars + other.dollars + (cents / 100);
        cents = (byte) (cents % 100);
        
        this.setCents(cents);
        this.setDollars(dollars);
        
        return this;
    }
    
    public DollarAmount add(int dollars) {
        this.dollars += dollars;
        
        return this;
    }
    
    /**
     * Subtract other dollar amount from this dollar amount.
     * @param other the amount to subtract. 
     * @return reference to this dollar amount.
     */
    public DollarAmount subtract(DollarAmount other) {
        
        byte cents = (byte) (this.cents - other.cents);
        
        int dollars = this.dollars - other.dollars;
        
        if(cents < 0) {
            dollars--;
            cents = (byte) (1 + cents);
        }
        
        this.setCents(cents);
        this.setDollars(dollars);
        
        return this;
    }
    
    /**
     * Multiply this dollar amount with an integer factor.
     * @param factor the number to multiply. 
     * @return reference to this dollar amount.
     */
    public DollarAmount multiply(int factor) {
        
        int cents = factor * this.cents;
        int dollars = factor * this.dollars + cents / 100;
        
        cents = (byte) (cents % 100);
        
        this.setCents((byte) cents);
        this.setDollars(dollars);
        return this;
    }
    
    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public byte getCents() {
        return cents;
    }

    public void setCents(byte cents) {
        if(cents > 99) {
            throw new InvalidCentAmountException(cents);
        }
        this.cents = cents;
    }
}
