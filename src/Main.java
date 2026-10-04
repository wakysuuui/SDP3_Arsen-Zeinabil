package robots;

import abstraction.DeliveryRobot;
import abstraction.IndustrialRobot;
import abstraction.Robot;
import implementation.AIController;
import implementation.RemoteController;

public class Main {

    public static void main(String[] args) {

        AIController aiController = new AIController();
        RemoteController remoteController = new RemoteController();

        Robot industrialRobot =
                new IndustrialRobot("FactoryBot", aiController);

        Robot deliveryRobot =
                new DeliveryRobot("DeliveryBot", remoteController);

        System.out.println("=== Industrial Robot ===");
        industrialRobot.move();
        industrialRobot.performTask();
        industrialRobot.stop();

        System.out.println();

        System.out.println("=== Delivery Robot ===");
        deliveryRobot.move();
        deliveryRobot.performTask();
        deliveryRobot.stop();

        System.out.println();

        System.out.println("=== Switching Controller ===");

        industrialRobot.setController(remoteController);

        industrialRobot.move();
        industrialRobot.performTask();
        industrialRobot.stop();
    }
}