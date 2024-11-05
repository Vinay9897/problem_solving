public class GamePlatform {
    static double currentSpeed = 0.0;

    public static double calculateFinalSpeed(double initialSpeed, int[] inclinations) {
        // throw new UnsupportedOperationException("Waiting to be implemented.");
        currentSpeed = initialSpeed;
        for (int i = 0; i < inclinations.length; i++) {
            if (inclinations[i] == 0 && currentSpeed == initialSpeed) {
                currentSpeed = initialSpeed;
            } else if (inclinations[i] == 30) {
                currentSpeed -= 30;
            } else if (inclinations[i] == 0 && inclinations[i - 1] == 30) {

            } else if (inclinations[i] == -45) {
                currentSpeed += 45;
            } else if (inclinations[i] == 0 && inclinations[i - 1] == -45) {
                currentSpeed = currentSpeed;
            }

        }
        return currentSpeed;
    }

    public static void main(String[] args) {
        System.out.println(calculateFinalSpeed(60.0, new int[] { 0, 30, 0, -45, 0 }));
    }
}