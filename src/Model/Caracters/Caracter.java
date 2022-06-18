package Model.Caracters;

import Model.Cards.Cards;

import java.util.List;

public class Caracter {
    private int health;
    private int shield;
    private List<Cards> allcard;
    private List<Cards> pickedup;
    private int money;

    public void setMoneyWithOne() {
        this.money++;
    }

    public void setMoneyPlus(int amount){
        this.money += amount;
    }


}
