package Model.Cards.Types;

import Model.Cards.Cards;

public class IncreaseMoney extends Cards {
    private int amount;
    private String detail;

    public IncreaseMoney(int h, int ms, int a, int md, int amount) {
        super(h, ms, a, md);
        this.amount = amount;
        detail = "A pénzed " + amount + "-val/vel nő";
    }

    public void Increase(){
        getCaracter().setMoneyPlus(amount);
    }

    public String getDetail() {
        return detail;
    }

    @Override
    public void Attack() {

    }

    @Override
    public void Attacked() {

    }
}
