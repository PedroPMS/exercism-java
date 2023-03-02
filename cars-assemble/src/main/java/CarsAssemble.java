public class CarsAssemble {
    private int CARS_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        return speed * this.CARS_PER_HOUR * this.successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) Math.round(speed * this.CARS_PER_HOUR / 60 * this.successRate(speed));
    }

    public double successRate(int speed) {
        if (speed >= 1 && speed <= 4) {
            return 1;
        }

        if (speed >= 5 && speed <= 8) {
            return 0.9;
        }

        return speed == 9 ? 0.8 : 0.77;
    }
}
