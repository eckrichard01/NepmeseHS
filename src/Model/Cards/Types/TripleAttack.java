package Model.Cards.Types;

import Model.Cards.Cards;

public class TripleAttack extends Cards {
    private boolean canAttack;
    private int attacked;

    public TripleAttack(int h, int ms, int a, int md, String n, int c) {
        super(h, ms, a, md, n, "3x tud támadni egy körben", c);
        attacked = 3;
        canAttack = true;
    }

    public boolean isCanAttack() {
        return canAttack;
    }

    public int getAttacked() {
        return attacked;
    }

    @Override
    public void Attack(Cards card) {
        if(canAttack){
            card.setHealth(card.getHealth() - this.getAttack());
            setHealth(getHealth() - card.getAttack());
            attacked--;

            if(attacked == 0){
                canAttack = false;
            }

            if(card.getHealth() <= 0){
                card.Die();
            }

            if(getHealth() <= 0){
                Die();
            }
        }
    }

    @Override
    public void Attacked() {

    }

    @Override
    public void Die() {
        getCaracter().CardDie(this);
    }

    @Override
    public void EndTurn() {
        canAttack = true;
        attacked = 3;
        getCaracter().setMoneyWithOne();
    }

    @Override
    public void PlayCard() {
        if(getCost() <= getCaracter().getMoney()){
            getCaracter().setMoney(getCaracter().getMoney() - getCost());
            getCaracter().getPickedup().remove(this);
            getCaracter().getPlayed().add(this);
        }

    }
}
