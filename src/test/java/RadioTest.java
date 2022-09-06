import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetUpVolume() {
        Radio radio = new Radio();

        radio.setUpVolume();

        int expected = 6;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUpVolumeMax() {
        Radio radio = new Radio();

        for (int i = 0; i < 10; i++) {
            radio.setUpVolume();
        }

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDownVolume() {
        Radio radio = new Radio();

        radio.setDownVolume();

        int expected = 4;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDownVolumeMin() {
        Radio radio = new Radio();

        for (int i = 0; i < 10; i++) {
            radio.setDownVolume();
        }

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setNextStation();

        int expected = 6;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setPrevStation();
        ;

        int expected = 4;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumStation() {
        Radio radio = new Radio();

        radio.setNumStation(9);
        radio.setNextStation();
        radio.setPrevStation();


        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumStationMax() {
        Radio radio = new Radio();

        radio.setNumStation(10);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumStationMin() {
        Radio radio = new Radio();

        radio.setNumStation(-1);


        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

}
