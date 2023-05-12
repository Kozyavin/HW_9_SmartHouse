package ru.netology.qajavamvn.service;

public class Radio {

    private int channelRadio;
    private int volumeRadio;

    public int getChannelRadio() {
        return channelRadio;
    }

    public void setChannelRadio(int newChannelRadio) {
        channelRadio = newChannelRadio;
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setVolumeRadio(int newVolumeRadio) {
        volumeRadio = newVolumeRadio;
    }

    public void nextChannel() {
        if (channelRadio < 9 & channelRadio >= 0) {
            channelRadio++;
            return;
        }
        if (channelRadio == 9) {
            channelRadio = 0;
        } else {
            channelRadio = 9;
        }
    }

    public void prevChannel() { //метод понижения каналла
        if (channelRadio <= 9 & channelRadio > 0) {
            channelRadio--;
            return;
        }
        if (channelRadio == 0) {
            channelRadio = 9;

        } else {
            channelRadio = 0;
        }
    }

    public void upVolumeRadio() {
        if (volumeRadio >= 0 & volumeRadio < 100) {
            volumeRadio++;
        } else {
            volumeRadio = 100;
        }
    }

    public void bottomVolumeRadio() {
        if (volumeRadio > 0 & volumeRadio <= 100) {
            volumeRadio--;
        } else {
            volumeRadio = 0;
        }
    }
}


