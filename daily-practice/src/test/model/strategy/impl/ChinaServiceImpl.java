package test.model.strategy.impl;

import test.model.strategy.TestService;

/**
 * @author: Vector
 * @Date: 2024/06/01 22:30
 */
public class ChinaServiceImpl implements TestService {

    private final static String TYPE = "CHINA";

    @Override
    public boolean support(String type) {
        return TYPE.equals(type);
    }

    @Override
    public void printMassage() {
        System.out.println("CHINA handle event.");
    }
}
