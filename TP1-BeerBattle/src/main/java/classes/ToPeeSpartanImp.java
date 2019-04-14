package classes;

import interfaces.IToPee;
import util.Tools;

public class ToPeeSpartanImp implements IToPee {
    @Override
    public int toPee() {
        return Tools.fRandomRange(-250,-100);
    }
}
