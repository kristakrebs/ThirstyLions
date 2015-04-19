package com.example.krista.thirstylions;

/**
 * Created by Edward Chan on 4/19/2015.
 */
public class Customer {

    protected int customerNumber;
    protected Beer beerRequest;
    protected boolean makeRequest;

    public Customer(){
        customerNumber=0;
        beerRequest=null;
        makeRequest=false;
    }
    public Customer(int n){
        customerNumber=n;
        beerRequest=null;
        makeRequest=false;
    }
    public Customer(int n, Beer request){
        customerNumber=n;
        beerRequest=request;
        makeRequest=true;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }
    public void setCustomerNumber(int num){
        customerNumber=num;
    }

    public Beer getBeerRequest(){
        return beerRequest;
    }
    public void setBeerRequest(Beer request){
        beerRequest=request;
    }

    public boolean isMakeRequest(){
        return makeRequest;
    }
    public void setMakeRequest() {
        makeRequest=
    }
}
