package test.model.strategy.impl;

import test.model.strategy.TestService;

/**
 * @author: Vector
 * @Date: 2024/06/01 22:32
 */
public class RussiaServiceImpl implements TestService {

    private final static String TYPE = "RUSSIA";
    @Override
    public boolean support(String type) {
        return TYPE.equals(type);
    }

    @Override
    public void printMassage() {
        System.out.println("RUSSIA handle event.");
    }
}
