package Model.Game;

import Model.Cards.ConcrateCards.Dobrogi;
import Model.Cards.ConcrateCards.LudasMatyi;

public class Game {
    public static void main(String args[]){
        LudasMatyi lm = new LudasMatyi(10,5,0,0);
        System.out.println(lm.getName() + "\n" + lm.getDetail() + "\n");
        System.out.println("Támadás: " +lm.getAttack());
        System.out.println("Élet: " + lm.getHealth());
        System.out.println("Varázssebzés: " + lm.getMagicDamage());
        System.out.println("Varászellenállás: " + lm.getMagicShield());

        System.out.println("\n\n");

        Dobrogi d = new Dobrogi(20,10,0,0);
        System.out.println(d.getName() + "\n" + d.getDetail() + "\n");
        System.out.println("Támadás: " +d.getAttack());
        System.out.println("Élet: " + d.getHealth());
        System.out.println("Varázssebzés: " + d.getMagicDamage());
        System.out.println("Varászellenállás: " + d.getMagicShield());
    }
}
