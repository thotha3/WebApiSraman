package com.upgrade.pojo;

public class LoanDetails {

    private String loanAmount;
    private String monthlyPayment;
    private String term;
    private String interestRate;
    private String apr;

    public LoanDetails() {
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public String getMonthlyPayment() {
        return monthlyPayment;
    }

    public String getTerm() {
        return term;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public String getApr() {
        return apr;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setMonthlyPayment(String monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public void setApr(String apr) {
        this.apr = apr;
    }
}
