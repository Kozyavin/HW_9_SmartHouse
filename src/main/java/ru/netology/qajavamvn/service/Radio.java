package ru.netology.qajavamvn.service;

public class Radio {

    private int maxChannelRadio = 9;
    private int minChannelRadio = 0;
    private int channelRadio;
    private int volumeRadio;
    private int maxVolumeRadio = 100;
    private int minVolumeRadio = 0;

    public Radio() {

    }
    public Radio(int sizeChannel) {
        if(sizeChannel <= 0){
            return;    //выход в этом месте = возврат к пустому конструктору public Radio(){ }
        }
        else
        {maxChannelRadio = sizeChannel -1;}

    }

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
        if (channelRadio < maxChannelRadio & channelRadio >= minChannelRadio) {
            channelRadio++;
            return;
        }
        if (channelRadio == maxChannelRadio) {
            channelRadio = minChannelRadio;
        } else {
            channelRadio = maxChannelRadio;
        }
    }

    public void prevChannel() { //метод понижения каналла
        if (channelRadio <= maxChannelRadio & channelRadio > minChannelRadio) {
            channelRadio--;
            return;
        }
        if (channelRadio == minChannelRadio) {
            channelRadio = maxChannelRadio;
        } else {
            channelRadio = minChannelRadio;
        }
    }

    public void upVolumeRadio() {
        if (volumeRadio >= minVolumeRadio & volumeRadio < maxVolumeRadio) {
            volumeRadio++;
        } else {
            volumeRadio = maxVolumeRadio;
        }
    }

    public void bottomVolumeRadio() {
        if (volumeRadio > minVolumeRadio & volumeRadio <= maxVolumeRadio) {
            volumeRadio--;
        } else {
            volumeRadio = minVolumeRadio;
        }
    }
}


