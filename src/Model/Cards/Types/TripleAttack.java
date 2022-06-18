package Model.Cards.Types;

import Model.Cards.Cards;

public class TripleAttack extends Cards {
    private boolean canAttack;
    private int attacked;
    private String detail;

    public TripleAttack(int h, int ms, int a, int md) {
        super(h, ms, a, md);
        detail = "3x tud támadni egy körben";
    }

    public boolean isCanAttack() {
        return canAttack;
    }

    public String getDetail() {
        return detail;
    }

    public int getAttacked() {
        return attacked;
    }

    @Override
    public void Attack() {

    }

    @Override
    public void Attacked() {

    }
}
