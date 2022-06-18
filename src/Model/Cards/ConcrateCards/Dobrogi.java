package Model.Cards.ConcrateCards;

import Model.Cards.Types.IncreaseMoney;

public class Dobrogi extends IncreaseMoney {
    private String name;

    public Dobrogi(int healt, int attack, int mShield, int mdamage){
        super(healt,mShield,attack,mdamage, 10);
        name = "Döbrögi";
    }

    public String getName(){
        return name;
    }
}
