package Model.Cards.Types;

import Model.Cards.Cards;

public class IncreaseMoney extends Cards {
    private int amount;

    public IncreaseMoney(int h, int ms, int a, int md, int amount, String n, int c) {
        super(h, ms, a, md, n, "A pénzed " + amount + "-val/vel nő", c);
        this.amount = amount;
    }

    public void Increase(){
        getCaracter().setMoneyPlus(amount);
    }

    @Override
    public void Attack(Cards card) {
        card.setHealth(card.getHealth() - this.getAttack());
        setHealth(getHealth() - card.getAttack());

        if(card.getHealth() <= 0){
            card.Die();
        }

        if(getHealth() <= 0){
            Die();
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
        getCaracter().setMoneyWithOne();
    }

    @Override
    public void PlayCard() {
        if(getCost() <= getCaracter().getMoney()){
            getCaracter().setMoney(getCaracter().getMoney() - getCost());
            Increase();
            getCaracter().getPickedup().remove(this);
            getCaracter().getPlayed().add(this);
        }
    }
}
