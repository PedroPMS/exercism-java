public class Lasagna {
    private int EXPECTED_MINUTES = 40;
    private int PREPARATION_TIME_FOR_LAYER = 2;

    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        return EXPECTED_MINUTES - actualMinutes;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return PREPARATION_TIME_FOR_LAYER * numberOfLayers;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutes) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutes;
    }
}
