package com.music;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicSystem {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MusicConfig.class);

        MusicPlayer player = context.getBean(MusicPlayer.class);

        player.playMusic();
    }
}