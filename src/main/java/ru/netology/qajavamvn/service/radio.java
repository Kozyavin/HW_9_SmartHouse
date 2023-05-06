package ru.netology.qajavamvn.service;

public class radio {

    public int channelRadio;
    public int volumeRadio;

    public int getChannelRadio() {
        return channelRadio;
    }

    public void setNextChannelRadio(int newChannelRadio) { //метод повышение каналла
        if (newChannelRadio < 9 & newChannelRadio >= 0) {
            channelRadio = newChannelRadio + 1;
            return;
        }//return чтобы ниже не пошли проверки
        if (newChannelRadio == 9) {
            channelRadio = 0;
        }
    }

    public void setPrevChannelRadio(int newChannelRadio) { //метод понижения каналла
        if (newChannelRadio <= 9 & newChannelRadio > 0) {
            channelRadio = newChannelRadio - 1;
            return;
        } //return чтобы ниже не пошли проверки
        if (newChannelRadio == 0) {
            channelRadio = 9;
        }
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setUpVolumeRadio() { // метод повышение уровня громкости
        if (volumeRadio >= 0 & volumeRadio < 100) {
            volumeRadio = volumeRadio + 1;
        } else {
            volumeRadio = 100;
        } // если пользователь выставит громкость 100, медод повышения уровня гром. не прибавит 1
    }

    public void setBottomVolumeRadio() { // метод понижения уровня громкости
        if (volumeRadio > 0 & volumeRadio <= 100) {
            volumeRadio = volumeRadio - 1;
        } else {
            volumeRadio = 0;
        } // если пользователь выставит громкость 0, медод понижения уровня гром. не вычтет 1
    }
}
