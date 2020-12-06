package lab16.cafe.menu;

import lab16.cafe.interfaces.Alcoholable;


public final class Drink extends MenuItem implements Alcoholable {

    private final double alcoholVol;
    private final DrinkTypeEnum type;


    public Drink(double alcoholVol, DrinkTypeEnum type) {
        this.alcoholVol = alcoholVol;
        this.type = type;
    }


    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol > 0;
    }

    public double getAlcoholVol() {
        return alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return type;
    }
}
