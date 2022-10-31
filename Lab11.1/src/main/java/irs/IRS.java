/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package irs;

import personnel.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * The IRS maintains a collection of TaxPayers and collects taxes from them.
 *
 * Note the interface type TaxPayer, used throughout the class.
 */
public class IRS {
    // what types of objects can this array contain?
    static private List<TaxPayer> payers = new ArrayList<TaxPayer>();
    //private TaxPayer[] payers = new TaxPayer[100];
    private int currentIndex = 0;  // for dealing with the array

    public void collectTaxes() {
        for (TaxPayer payer : payers) {
            double deduction = payer.getStandardDeduction();
            System.out.println("Tax payer's deduction is: " + deduction);
            payer.payTaxes();
            System.out.println();

            //This won't work because IS-a relationship does not work the other way around
            //payers[i].getName();
        }
    }
    
    // helper method to add a TaxPayer to the array
    // what types of objects can be passed to this method?
    public void register(TaxPayer payer) {
        payers.add(payer);
    }
}