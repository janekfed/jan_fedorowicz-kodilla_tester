package com.kodilla.bank.homework;

public class Bank {

    private String name;
    private CashMachine[] cashMachinesTab = new CashMachine[4];
    private int size = 0;

    public Bank() {
        this.cashMachinesTab = new CashMachine[6];
        this.name = "CashMachine";
        for (int i = 0; i < cashMachinesTab.length; i++) {
            cashMachinesTab[i] = new CashMachine();
        }
    }

    public CashMachine[] getCashMachinesTab() {
        return cashMachinesTab;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[size];
        System.arraycopy(cashMachinesTab, 0, newTab, 0, cashMachinesTab.length);
        newTab[size - 1] = cashMachine;
        cashMachinesTab = newTab;
    }

    public int accountBalance() {
        int balance = 0;
        for (int i = 0; i > cashMachinesTab.length; i++) {
            CashMachine cashMachine = cashMachinesTab[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                balance = balance + cashMachine.getTransactions()[j];
            }
        }
        return balance;
    }

    public int numberOfWithdrawTransactions() {
        int withdrawNumber = 0;
        for (int i = 0; i < cashMachinesTab.length; i++) {
            CashMachine cashMachine = cashMachinesTab[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                if (cashMachine.getTransactions()[j] < 0) {
                    withdrawNumber = withdrawNumber + 1;
                }
            }
        }
        return withdrawNumber;
    }

    public int numberOfDepositTransactions() {
        int depositNumber = 0;
        for (int i = 0; i < cashMachinesTab.length; i++) {
            CashMachine cashMachine = cashMachinesTab[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                if (cashMachine.getTransactions()[j] > 0) {
                    depositNumber = depositNumber + 1;
                }
            }
        }
        return depositNumber;
    }


    public double averageWithdraw() {
        if (this.cashMachinesTab.length == 0) {
            return 0;
        }
        double withdraw = 0;
        double withdrawNumber = 0;
        for (int i = 0; i < cashMachinesTab.length; i++) {
            CashMachine cashMachine = cashMachinesTab[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                if (cashMachine.getTransactions().length > 0) {
                    withdraw = withdraw + cashMachine.getTransactions()[j];
                    withdrawNumber = withdrawNumber - 1;
                }
            }
        }
        return withdraw / withdrawNumber;
    }

    public double averageDeposit() {
        if (this.cashMachinesTab.length == 0) {
            return 0;
        }
        double deposit = 0;
        double depositNumber = 0;
        for (int i = 0; i < cashMachinesTab.length; i++) {
            CashMachine cashMachine = cashMachinesTab[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                if (cashMachine.getTransactions()[j] > 0) {
                    deposit = deposit + cashMachine.getTransactions()[j];
                    depositNumber = depositNumber + 1;
                }
            }
        }
        return deposit / depositNumber;
    }

    public int addDepositCashMachine(int operation, int cashMachineNumber) {
        if (this.cashMachinesTab.length == 0) {
            return 0;
        }
        if (operation > 0 && operation < 300) {
            this.cashMachinesTab[cashMachineNumber].addTransaction(operation);
        }
        return operation;
    }

    public void addWithdrawCashMachine(int operation, int cashMachineNumber) {
        if (operation > -20 && operation < 0) {
            this.cashMachinesTab[cashMachineNumber].addTransaction(operation);
        }
    }

    public double getAverageAmountDepositOperations() {
        if (this.cashMachinesTab.length == 0) {
            return 0;
        }
        double deposit = 0;
        double depositNumber = 0;
        for (int i = 0; i < cashMachinesTab.length; i++) {
            CashMachine cashMachine = cashMachinesTab[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                if (cashMachine.getTransactions()[j] > 0) {
                    deposit = deposit + cashMachine.getTransactions()[j];
                    depositNumber = depositNumber + 1;
                }
            }
        }
        return deposit / depositNumber;
    }

    public double getAverageAmountWithdrawOperations() {
        if (this.cashMachinesTab.length == 0) {
            return 0;
        }
        double withdraw = 0;
        double withdrawNumber = 0;
        for (int i = 0; i < cashMachinesTab.length; i++) {
            CashMachine cashMachine = cashMachinesTab[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                if (cashMachine.getTransactions().length > 0) {
                    withdraw = withdraw + cashMachine.getTransactions()[j];
                    withdrawNumber = withdrawNumber - 1;
                }
            }
        }
        return withdraw / withdrawNumber;


    }
}