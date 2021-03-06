/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.tickets.resto.nc.api;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author salad74
 */
public class Transaction {

    public Transaction() {

    }

    public Transaction(Date date, String libele, int debit, int credit) {
        setDate(date);
        setLibelle(libele);
        setDebit(debit);
        setCredit(credit);
    }

    public String toString() {
        String out = "";
        //out = "Date : " + getDate() + "\nLibele : " + getLibelle() + "\nDebit : " + getDebit() + "\nCredit : " + getCredit();
        out = "Date : " + getDate() + " (" + getLibelle() + ")";
        return out;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Transaction)) {
            return false;
        }

        Transaction that = (Transaction) other;

        // Custom equality
        return this.date.equals(that.date)
                && this.libelle.equals(that.libelle)
                && this.debit == that.debit
                && this.credit == that.credit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.date);
        hash = 53 * hash + Objects.hashCode(this.libelle);
        hash = 53 * hash + this.debit;
        hash = 53 * hash + this.credit;
        return hash;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the debit
     */
    public int getDebit() {
        return debit;
    }

    /**
     * @param debit the debit to set
     */
    public void setDebit(int debit) {
        this.debit = debit;
    }

    /**
     * @return the credit
     */
    public int getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }
    private Date date;
    private String libelle;
    private int debit;
    private int credit;
}
