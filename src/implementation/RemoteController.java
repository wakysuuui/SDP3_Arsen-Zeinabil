package implementation;

public class RemoteController implements RobotController {

    @Override
    public void move() {
        System.out.println("Remote controller: Robot is moving by remote commands.");
    }

    @Override
    public void performTask() {
        System.out.println("Remote controller: Robot is performing the task by remote control.");
    }

    @Override
    public void stop() {
        System.out.println("Remote controller: Robot stopped by remote command.");
    }
}