package Model.Cards.ConcrateCards;

import Model.Cards.Types.TripleAttack;

public class LudasMatyi extends TripleAttack {
    private String name;

    public LudasMatyi(int healt, int attack, int mShield, int mdamage){
        super(healt,mShield,attack,mdamage);
        name = "Ludas Matyi";
    }

    public String getName(){
        return name;
    }
}
