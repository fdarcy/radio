public class Radio {
    private int currentVolume;
    private int maxNumberStation;
    private int minNumberStation;
    private int currentStation;

    public Radio(int stationCount) {
        this.maxNumberStation = stationCount - 1;
    }

    public Radio() {
        this.maxNumberStation = 9;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStation(int currentStation) {
        if (currentStation < minNumberStation) {
            return;
        }

        if (currentStation > maxNumberStation) {
            return;
        }

        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation == maxNumberStation) {
            currentStation = minNumberStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == minNumberStation) {
            currentStation = maxNumberStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}