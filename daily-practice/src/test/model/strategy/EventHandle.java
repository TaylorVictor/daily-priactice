package test.model.strategy;

import test.model.strategy.impl.ChinaServiceImpl;
import test.model.strategy.impl.RussiaServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Vector
 * @Date: 2024/06/01 22:34
 *
 */
public class EventHandle {

    private final List<TestService> testServiceList;

    public EventHandle(List<TestService> testServiceList) {
        this.testServiceList = testServiceList;
    }

    public void handle(String event) {
        for (TestService testService : testServiceList) {
            if (testService.support(event)) {
                testService.printMassage();
            }
        }
    }

    public static void main(String[] args) {
        TestService chinaService = new ChinaServiceImpl();
        TestService russiaService = new RussiaServiceImpl();

        List<TestService> testServiceList = new ArrayList<>();
        testServiceList.add(chinaService);
        testServiceList.add(russiaService);
        EventHandle handle = new EventHandle(testServiceList);

        handle.handle("CHINA");

        handle.handle("RUSSIA");
    }

}
