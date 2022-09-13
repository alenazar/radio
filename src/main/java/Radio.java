public class Radio {

    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

    private int maxStation = 9;
    private int minStation = 0;
    private int station = minStation;

    public Radio(int amountStations) {
        this.maxStation = amountStations - 1;
    }

    public Radio() {

    }

    public void setUpVolume() {
        if (volume < 100) {
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
        if (station < maxStation) {
            station++;
        } else {
            station = 0;
        }
    }

    public void setPrevStation() {
        if (station > 0) {
            station--;
        } else {
            station = maxStation;
        }
    }

    public void setNumStation(int numStation) {
        if (numStation >= 0 && numStation <= maxStation) {
            station = numStation;
        }
    }

    public int getStation() {
        return station;
    }
}
