package com.music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MusicConfig {

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer();
    }

    @Bean
    public Speaker speaker1() {
        return new Speaker();
    }

    @Bean
    public Speaker speaker2() {
        return new Speaker();
    }

    @Bean
    public Amplifier amp1() {
        return new Amplifier();
    }

    @Bean
    public Amplifier amp2() {
        return new Amplifier();
    }
}