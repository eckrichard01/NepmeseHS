package Model.Caracters;

import Model.Cards.Cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Caracter {
    private int health;
    private int shield;
    private List<Cards> drawable;
    private List<Cards> pickedup;
    private List<Cards> played;
    private int money;

    public Caracter(int h, int s){
        money = 1;
        health = h;
        shield = s;
        drawable = new ArrayList<>();
        pickedup = new ArrayList<>();
        played = new ArrayList<>();
    }

    public void setMoneyWithOne() {
        this.money++;
    }

    public void setMoneyPlus(int amount){
        this.money += amount;
    }

    public void setDrawable(ArrayList<Cards> cards){
        drawable = cards;
    }

    public List<Cards> getDrawable() {
        return drawable;
    }

    public List<Cards> getPickedup() {
        return pickedup;
    }

    public List<Cards> getPlayed() {
        return played;
    }

    public int getMoney() {
        return money;
    }

    public void DrawCard(){
        int random = new Random().nextInt(drawable.size());
        Cards card = drawable.get(random);
        pickedup.add(card);
        drawable.remove(card);
    }

    public void CardDie(Cards card){
        played.remove(card);
    }

    public void EndTurn(){
        for(Cards c : played){
            c.EndTurn();
        }
    }
}
