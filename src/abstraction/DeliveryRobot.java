package abstraction;

import implementation.RobotController;

public class DeliveryRobot extends Robot {

    public DeliveryRobot(String name, RobotController controller) {
        super(name, controller);
    }

    @Override
    public void performTask() {
        System.out.println(getName() + ": delivering a package.");
        controller.performTask();
    }
}