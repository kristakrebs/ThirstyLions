package com.example.krista.thirstylions;

/**
 * Created by Edward Chan on 4/19/2015.
 */
public class Tap {
    protected boolean inUse;
    protected Beer beertype;

    public Tap(){
        inUse=false;
        beertype=null;
    }

    public Tap(Beer type){
        inUse=true;
        beertype=type;
    }

    public Beer getBeertype(){
        return beertype;
    }
    public void setBeertype(Beer type){
        beertype=type;
    }
    public boolean getInUse(){
        return inUse;
    }
    public void setInUse(boolean use){
        inUse=use;
    }
}
