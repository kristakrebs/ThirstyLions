package com.example.krista.thirstylions;

/**
 * Created by Aldrich on 4/21/2015.
 */
public class Serving extends Thread{

    private Player player;
    private Customer customer;
    private Tap tap;

    public Serving(Player p, Customer c, Tap t){
        this.player = p;
        this.customer = c;
        this.tap = t;

        lockResources();
    }

    public void lockResources(){
        synchronized(tap){
            synchronized (customer){
                try{
                    this.sleep(5000);
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

                increaseScore();
            }
        }
    }

    public void increaseScore(){
        player.setScore(player.getScore() + 1);
    }
}
