class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] = this.birdsPerDay[this.birdsPerDay.length - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int numberOfBirds : this.birdsPerDay) {
            if (numberOfBirds == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int acc = 0;
        for (int i = 0; i < numberOfDays; i++) {
            if (i < this.birdsPerDay.length){ 
                acc += this.birdsPerDay[i];
            }
        }

        return acc;
    }

    public int getBusyDays() {
        int counter = 0;
        for (int numberOfBirds : this.birdsPerDay) {
            if (numberOfBirds >= 5) {
                counter++;
            }
        }

        return counter;
    }
}
