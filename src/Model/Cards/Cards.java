package Model.Cards;

import Model.Caracters.Caracter;

public abstract class Cards {
    private int health;
    private int magicShield;
    private int attack;
    private int magicDamage;
    private int cost;
    private String name;
    private String detail;
    private Caracter caracter;

    public Cards(int h, int ms, int a, int md, String n, String d, int c){
        health = h;
        magicDamage = md;
        magicShield = ms;
        attack = a;
        name = n;
        detail = d;
        cost = c;
    }

    public int getHealth(){
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public int getMagicShield() {
        return magicShield;
    }

    public Caracter getCaracter() {
        return caracter;
    }

    public void setCaracter(Caracter caracter) {
        this.caracter = caracter;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public void setMagicShield(int magicShield) {
        this.magicShield = magicShield;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract void Attack(Cards card);

    public abstract void Attacked();

    public abstract void Die();

    public abstract void EndTurn();

    public abstract void PlayCard();

    public String getName(){
        return name;
    }

    public String getDetail() {
        return detail;
    }
}
