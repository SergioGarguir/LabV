package classes;

import interfaces.IToDrink;
import util.Tools;

public class ToDrinkSpartanImp implements IToDrink {
    @Override
    public int toDrink() {
        return Tools.fRandomRange(1,20);
    }
}
