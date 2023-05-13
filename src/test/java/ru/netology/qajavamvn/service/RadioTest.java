package ru.netology.qajavamvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void NextPositiveIntervalTest() {
        Radio rad = new Radio(20);

        rad.setChannelRadio(11);
        rad.nextChannel();
        int expected = 12;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextNegativeIntervalTest() {// при sizeChannel <=0, будет по умолчанию sizeChannel =10 (или же maxChannelRadio =9)
        Radio rad = new Radio(-5);

        rad.setChannelRadio(11);
        rad.nextChannel();
        int expected = 9;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextChannelRadioTest() {
        Radio rad = new Radio();

        rad.setChannelRadio(5);
        rad.nextChannel();
        int expected = 6;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxNextChannelRadioTest() {
        Radio rad = new Radio();

        rad.setChannelRadio(9);
        rad.nextChannel();
        int expected = 0;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upMaxNextChannelRadioTest() {
        Radio rad = new Radio();

        rad.setChannelRadio(10);
        rad.nextChannel();
        int expected = 9;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overNullNextChannelRadioTest() {
        Radio rad = new Radio();

        rad.setChannelRadio(-1);
        rad.nextChannel();
        int expected = 9;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevChannelRadioTest() {
        Radio rad = new Radio();

        rad.setChannelRadio(5);
        rad.prevChannel();
        int expected = 4;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinPrevChannelRadioTest() {
        Radio rad = new Radio();

        rad.setChannelRadio(0);
        rad.prevChannel();
        int expected = 9;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overNullPrevChannelRadioTest() {
        Radio rad = new Radio();

        rad.setChannelRadio(-1);
        rad.prevChannel();
        int expected = 0;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upMaxPrevChannelRadioTest() {
        Radio rad = new Radio();

        rad.setChannelRadio(10);
        rad.prevChannel();
        int expected = 0;
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextVolumeRadioTest() {
        Radio rad = new Radio();

        rad.setVolumeRadio(55);
        rad.upVolumeRadio();
        int expected = 56;
        int actual = rad.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxNextVolumeRadioTest() {
        Radio rad = new Radio();

        rad.setVolumeRadio(100);
        rad.upVolumeRadio();
        int expected = 100;
        int actual = rad.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overNullVolumeRadioTest() {
        Radio rad = new Radio();

        rad.setVolumeRadio(-1);
        rad.upVolumeRadio();
        int expected = 100;
        int actual = rad.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevVolumeRadioTest() {
        Radio rad = new Radio();

        rad.setVolumeRadio(55);
        rad.bottomVolumeRadio();
        int expected = 54;
        int actual = rad.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinPrevVolumeRadioTest() {
        Radio rad = new Radio();

        rad.setVolumeRadio(0);
        rad.bottomVolumeRadio();
        int expected = 0;
        int actual = rad.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void over100VolumeRadioTest() {
        Radio rad = new Radio();

        rad.setVolumeRadio(101);
        rad.bottomVolumeRadio();
        int expected = 0;
        int actual = rad.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }


}