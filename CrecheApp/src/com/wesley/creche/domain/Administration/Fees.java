/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wesley.creche.domain.Administration;

/**
 *
 * @author TaswellSalie
 */
public class Fees {
    private int fee_id;
    private int child_id;
    private double amountDue;
    private String status;
    private double total;

    public int getFee_id() {
        return fee_id;
    }

    public void setFee_id(int fee_id) {
        this.fee_id = fee_id;
    }

    public int getChild_id() {
        return child_id;
    }

    public void setChild_id(int child_id) {
        this.child_id = child_id;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
