package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuit {
    Bank bank = new Bank();
    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldAddTwoElementsToArray() {
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(500);

        int[] values = cashMachine.getTransactions();
        assertEquals(2, values.length);
        assertEquals(200, values[0]);
        assertEquals(500, values[1]);
    }

    @Test
    public void shouldCalculateAverageOfDepositOperations() {
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(100);

        assertEquals(266.66, cashMachine.getAverage(), 1.0);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        assertEquals(0, cashMachine.getAverage(), 0.0001);
    }
}


