package implementation;

public class AIController implements RobotController {

    @Override
    public void move() {
        System.out.println("AI controller: Robot is moving autonomously.");
    }

    @Override
    public void performTask() {
        System.out.println("AI controller: Robot is performing the task using AI.");
    }

    @Override
    public void stop() {
        System.out.println("AI controller: Robot stopped.");
    }
}