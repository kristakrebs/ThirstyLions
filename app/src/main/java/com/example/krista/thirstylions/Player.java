package com.example.krista.thirstylions;

/**
 * Created by Edward Chan on 4/19/2015.
 */
public class Player {
    protected int id_number;
    protected String color;
    protected int score;

    public Player(){
        id_number=0;
        color="";
        score=0;
    }
    public Player(int id, String c){
        id_number=id;
        color=c;
        score=0;
    }

    public int getId_number(){
        return id_number;
    }
    public void setId_number(int id){
        id_number=id;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color=c;
    }

    public int getScore(){
        return score;
    }
    public void setScore(int s){
        score=s;
    }
}
