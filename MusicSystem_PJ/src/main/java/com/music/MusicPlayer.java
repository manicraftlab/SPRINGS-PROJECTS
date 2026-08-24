package com.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MusicPlayer {

    private Speaker speaker;
    private Amplifier amplifier;

    @Autowired
    @Qualifier("speaker1")
    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    @Autowired
    @Qualifier("amp1")
    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void playMusic() {

        amplifier.boostSignal();
        speaker.playSound();

        System.out.println("Music is now playing !!");
    }
}