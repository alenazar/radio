import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetUpVolume() {
        Radio radio = new Radio(0,100,0,9);

        radio.setUpVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUpVolumeMax() {
        Radio radio = new Radio(100,100,0,9);

        for (int i = 0; i < 1; i++) {
            radio.setUpVolume();
        }

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDownVolume() {
        Radio radio = new Radio(1,100,0,9);

        radio.setDownVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDownVolumeMin() {
        Radio radio = new Radio(0,100,0,9);

        for (int i = 0; i < 1; i++) {
            radio.setDownVolume();
        }

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio(0,100,0,9);

        radio.setNextStation();

        int expected = 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMin() {
        Radio radio = new Radio(0,100,9,9);

        radio.setNextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio(0,100,5,9);

        radio.setPrevStation();

        int expected = 4;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationMax() {
        Radio radio = new Radio(0,100,0,9);

        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumStation() {
        Radio radio = new Radio(0,100,0,9);

        radio.setNumStation(5);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumStationMax() {
        Radio radio = new Radio(0,100,0,9);

        radio.setNumStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumStationMin() {
        Radio radio = new Radio(0,100,0,9);

        radio.setNumStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

}
