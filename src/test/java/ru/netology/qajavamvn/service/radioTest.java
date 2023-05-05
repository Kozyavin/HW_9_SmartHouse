package ru.netology.qajavamvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class radioTest {

    @Test
    public void NextChannelRadioTest() {//повышение каналлов
        radio rad = new radio();

        rad.setNextChannelRadio(0);//указываем текущий каналл и запуск. метод перек. каналлов NextChannel
        int expected = 1;//ожидаем, что каналл поВысится на +1 после применения метода NextChannel
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MaxNextChannelRadioTest() {//установка каналла выше максимального MAX возможного каналла (9)
        radio rad = new radio();

        rad.setNextChannelRadio(9);//указываем текущий каналл и запуск. метод перек. каналлов NextChannel
        int expected = 0;//ожидаем, что каналл сбросится до 0-го после применения метода NextChannel
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void PrevChannelRadioTest() {//понижение каналлов в пределах диапазона
        radio rad = new radio();

        rad.setPrevChannelRadio(1);//указываем текущий каналл и запуск. метод перек. каналлов PrevChannel
        int expected = 0;//ожидаем, что каналл понизится на -1 после применения метода PrevChannel
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MinPrevChannelRadioTest() {//понижение каналлов, переход с 0 на 9 каналл
        radio rad = new radio();

        rad.setPrevChannelRadio(0);//указываем текужий каналл и жмём кнопку PrevChannel
        int expected = 9;//ожидаем, что выставится каналл 9, после применения метода PrevChannel
        int actual = rad.getChannelRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void UpVolumeRadioTest(){// метод повышения уровни громкости
        radio rad = new radio();

        rad.volumeRadio = 55;
        rad.setUpVolumeRadio();
        int expected = 56;// ожидаем прибавку +1 уровень громкости 55+1=56
        int actual = rad.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MaxUpVolumeRadioTest(){// метод повышения уровня громкости при MAX уровне (100)
        radio rad = new radio();

        rad.volumeRadio = 100;
        rad.setUpVolumeRadio();
        int expected = 100;// ожидаем неизменную громкость - 100
        int actual = rad.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void BottomVolumeRadioTest(){// метод понижения уровни громкости
        radio rad = new radio();

        rad.volumeRadio = 55;
        rad.setBottomVolumeRadio();
        int expected = 54;// ожидаем убавление -1 уровень громкости 55-1=54
        int actual = rad.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MinBottomVolumeRadioTest(){ // метод понижения уровня громкости при MIN уровне (0)
        radio rad = new radio();

        rad.volumeRadio = 0;
        rad.setBottomVolumeRadio();
        int expected = 0;// при убавлении с громкости 0 - уровень громкости остаётся 0
        int actual = rad.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
}
