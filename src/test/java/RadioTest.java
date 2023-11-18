import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStationCorrectly() {
        Radio radio = new Radio();

        radio.setStation(5);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationIfStationTooBig() {
        Radio radio = new Radio();

        radio.setStation(5);
        radio.setStation(5345345);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationIfStationTooSmall() {
        Radio radio = new Radio();

        radio.setStation(5);
        radio.setStation(-5345345);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationCorrect() {
        Radio radio = new Radio();

        radio.setStation(5);
        radio.next();

        int expected = 6;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationCorrectIfCurrentStationLast() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationCorrect() {
        Radio radio = new Radio();

        radio.setStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationCorrectIfCurrentStationFirst() {
        Radio radio = new Radio();

        radio.setStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeCorrect() {
        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeCorrectManyTimes() {
        Radio radio = new Radio();

        for (int i = 0; i < 10000; i++) {
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeCorrect() {
        Radio radio = new Radio();

        for (int i = 0; i < 50; i++) {
            radio.increaseVolume();
        }

        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeCorrectManyTimes() {
        Radio radio = new Radio();

        for (int i = 0; i < 10000; i++) {
            radio.decreaseVolume();
        }

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
