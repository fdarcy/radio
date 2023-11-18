public class Radio {
    private int station;
    private int volume;

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }

        if (newStation > 9) {
            return;
        }

        station = newStation;
    }

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        if (station == 9) {
            station = 0;
        } else {
            station = station + 1;
        }
    }

    public void prev() {
        if (station == 0) {
            station = 9;
        } else {
            station = station - 1;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}