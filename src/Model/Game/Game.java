package Model.Game;

import Model.Caracters.Caracter;
import Model.Cards.Cards;
import Model.Cards.ConcrateCards.Dobrogi;
import Model.Cards.ConcrateCards.LudasMatyi;

import java.util.ArrayList;

public class Game {
    private static Caracter caracter;
    private static Caracter caracter2;
    private static LudasMatyi lm;
    private static Dobrogi d;

    public static void Init(){
        caracter = new Caracter(30,0);
        caracter2 = new Caracter(10, 0);
        lm = new LudasMatyi(100,5,0,0);
        d = new Dobrogi(20,10,0,0);
        ArrayList<Cards> c1 = new ArrayList<>();
        c1.add(lm);
        lm.setCaracter(caracter);
        caracter.setDrawable(c1);

        ArrayList<Cards> c2 = new ArrayList<>();
        c2.add(d);
        d.setCaracter(caracter2);
        caracter2.setDrawable(c2);
    }

    public static void Print(){
        if(caracter.getPlayed().size() > 0){
            System.out.println(caracter.getPlayed().get(0).getName() + "\n" + caracter.getPlayed().get(0).getDetail());
            System.out.println("Támadás: " +caracter.getPlayed().get(0).getAttack());
            System.out.println("Élet: " + caracter.getPlayed().get(0).getHealth());
            System.out.println("Varázssebzés: " + caracter.getPlayed().get(0).getMagicDamage());
            System.out.println("Varászellenállás: " + caracter.getPlayed().get(0).getMagicShield());
        }

        System.out.println("\n");

        if(caracter2.getPlayed().size() > 0){
            System.out.println(caracter2.getPlayed().get(0).getName() + "\n" + caracter2.getPlayed().get(0).getDetail());
            System.out.println("Támadás: " +caracter2.getPlayed().get(0).getAttack());
            System.out.println("Élet: " + caracter2.getPlayed().get(0).getHealth());
            System.out.println("Varázssebzés: " + caracter2.getPlayed().get(0).getMagicDamage());
            System.out.println("Varászellenállás: " + caracter2.getPlayed().get(0).getMagicShield());
        }

        System.out.println("Caracter1: " + caracter.getPlayed().size() + ", " + caracter.getMoney());
        System.out.println("Caracter2: " + caracter2.getPlayed().size() + ", " + caracter2.getMoney());
        System.out.println("-----------------------------------------");
    }

    public static void Test(){
        /**
         * Turn 1
         */
        caracter.DrawCard();
        caracter.getPickedup().get(0).PlayCard();
        caracter.EndTurn();
        Print();
        /**
         * Turn 2
         */
        caracter2.DrawCard();
        caracter2.getPickedup().get(0).PlayCard();
        caracter2.getPlayed().get(0).Attack(caracter.getPlayed().get(0));
        caracter2.EndTurn();
        Print();
        /**
         * Turn 3
         */
        caracter.getPlayed().get(0).Attack(caracter2.getPlayed().get(0));
        caracter.getPlayed().get(0).Attack(caracter2.getPlayed().get(0));
        caracter.getPlayed().get(0).Attack(caracter2.getPlayed().get(0));
        caracter.EndTurn();
        Print();
    }

    public static void main(String args[]){
        Init();
        Test();
    }
}
