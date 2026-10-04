package abstraction;

import implementation.RobotController;

public class IndustrialRobot extends Robot {

    public IndustrialRobot(String name, RobotController controller) {
        super(name, controller);
    }

    @Override
    public void performTask() {
        System.out.println(getName() + ": assembling products in the factory.");
        controller.performTask();
    }
}