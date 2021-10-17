package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size = 0;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = size;
    }

    public void addTransaction(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        transactions = newTab;
    }

    public void depositCashMachine(int deposit) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = deposit;
        this.transactions = newTab;
    }

    public void withdrawCashMachine(int withdraw) {
        this.size++;
        int[] newTab2 = new int[this.size];
        System.arraycopy(transactions, 0, newTab2, 0, transactions.length);
        newTab2[this.size - 1] = withdraw;
        this.transactions = newTab2;
    }

    public int numberOfCashMachineTransactions() {
        return transactions.length;
    }

    public int balanceCashMachine() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int balance = 0;
        for (int i = 0; i < transactions.length; i++) {
            balance += transactions[i];
        }
        return balance;
    }

    public double getAverage() {
        if (transactions.length == 0) {
            return 0;
        }
        return balanceCashMachine() / transactions.length;
    }

    public int[] getTransactions() {
        return transactions;
    }


}

