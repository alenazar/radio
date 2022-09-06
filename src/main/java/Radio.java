public class Radio {

    private int volume = 5;
    private int station = 5;

    public void setUpVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void setDownVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setNextStation() {
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void setPrevStation() {
        if (station > 0) {
            station--;
        } else {
            station = 9;
        }
    }

    public void setNumStation(int numStation) {
        if (numStation >= 0 && numStation <= 9) {
            station = numStation;
        }
    }

    public int getStation() {
        return station;
    }
}
