package common.creational.builder;

import common.interfaces.*;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
