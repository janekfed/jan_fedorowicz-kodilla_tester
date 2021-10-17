package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {

    Bank bank = new Bank();
    CashMachine cashMachine = new CashMachine();

    @Test
    public void AveragesInRange() {
        bank.addDepositCashMachine(20, 3);
        bank.addDepositCashMachine(10, 2);

        bank.addWithdrawCashMachine(20, 1);
        bank.addWithdrawCashMachine(10, 5);
        bank.addWithdrawCashMachine(30, 4);

        double depositAverage = bank.getAverageAmountDepositOperations();
        double withdrawAverage = bank.getAverageAmountWithdrawOperations();

        assertEquals(15, depositAverage, 0.01);
        assertEquals(-15, withdrawAverage, 0.01);
    }

    @Test
    public void AveragesOutsideRange() {
        bank.addDepositCashMachine(0, 3);
        bank.addDepositCashMachine(-10, 5);

        bank.addWithdrawCashMachine(-3, 3);
        bank.addWithdrawCashMachine(5, 2);

        assertEquals(-0, bank.getAverageAmountDepositOperations(), 0.01);
        assertEquals(-4, bank.getAverageAmountWithdrawOperations(), 0.01);
    }
}
