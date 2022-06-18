package Model.Cards;

import Model.Caracters.Caracter;

public abstract class Cards {
    private int health;
    private int magicShield;
    private int attack;
    private int magicDamage;
    private Caracter caracter;

    public Cards(int h, int ms, int a, int md){
        health = h;
        magicDamage = md;
        magicShield = ms;
        attack = a;
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

    public abstract void Attack();

    public abstract void Attacked();
}
