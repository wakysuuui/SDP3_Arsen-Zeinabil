package abstraction;

import implementation.RobotController;

public abstract class Robot {

    protected RobotController controller;
    private String name;

    public Robot(String name, RobotController controller) {
        this.name = name;
        this.controller = controller;
    }

    public String getName() {
        return name;
    }

    public void setController(RobotController controller) {
        this.controller = controller;
    }

    public abstract void performTask();

    public void move() {
        controller.move();
    }

    public void stop() {
        controller.stop();
    }

    @Override
    public String toString() {
        return "Robot{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Robot)) {
            return false;
        }

        Robot robot = (Robot) obj;
        return name.equals(robot.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}