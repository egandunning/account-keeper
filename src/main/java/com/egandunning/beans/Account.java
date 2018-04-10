package com.egandunning.beans;

import java.io.Serializable;

import com.egandunning.models.DollarAmount;

/**
 * Represents an online account. For record-keeping purposes.
 * @author dunning
 *
 */
public class Account implements Serializable {

    public static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String url;
    private String owner;
    private StreetAddress address;
    private String phone;
    private String data;
    private DollarAmount paymentAmount;
    private int paymentsPerYear;

    public Account() {
        id = 0;
    }

    public Account(long id, String name, String url, String owner, StreetAddress address,
            String phone, String data, DollarAmount paymentAmount, int paymentsPerYear) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.owner = owner;
        this.address = address;
        this.phone = phone;
        this.data = data;
        this.paymentAmount = paymentAmount;
        this.paymentsPerYear = paymentsPerYear;
    }
    
    /**
     * Create an account with no payment amount.
     * @param id
     * @param name
     * @param url
     * @param owner
     * @param address
     * @param phone
     * @param data
     */
    public Account(long id, String name, String url, String owner, StreetAddress address,
            String phone, String data) {
        this(id, name, url, owner, address, phone, data, new DollarAmount(), 0);
    }

    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public StreetAddress getAddress() {
        return address;
    }

    public void setAddress(StreetAddress address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DollarAmount getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(DollarAmount paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentsPerYear() {
        return paymentsPerYear;
    }

    public void setPaymentsPerYear(int paymentsPerYear) {
        this.paymentsPerYear = paymentsPerYear;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", url=" + url
                + ", owner=" + owner + ", address=" + address + ", phone="
                + phone + ", data=" + data + ", paymentAmount=" + paymentAmount
                + ", paymentsPerYear=" + paymentsPerYear + "]";
    }
}