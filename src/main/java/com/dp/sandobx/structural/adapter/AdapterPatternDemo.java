package com.dp.sandobx.structural.adapter;

// ===== Step 6: Demo =====
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song1.mp3");
        audioPlayer.play("mp4", "movie1.mp4");
        audioPlayer.play("vlc", "video1.vlc");
        audioPlayer.play("avi", "film.avi"); // unsupported
    }
}
