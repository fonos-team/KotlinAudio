package com.doublesymmetry.kotlin_audio_sample.utils

import com.doublesymmetry.kotlinaudio.models.DefaultAudioItem
import com.doublesymmetry.kotlinaudio.models.MediaType


val firstItem = DefaultAudioItem(
    "https://react-native-track-player.js.org/example/Longing.mp3", MediaType.DEFAULT,
    title = "Longing",
    artwork = "https://react-native-track-player.js.org/example/Longing.jpeg",
    artist = "David Chavez",
    duration = 143000
)

val secondItem = DefaultAudioItem(
    "https://react-native-track-player.js.org/example/Soul%20Searching.mp3", MediaType.DEFAULT,
    title = "Soul Searching (Demo)",
    artwork = "https://react-native-track-player.js.org/example/Soul%20Searching.jpeg",
    artist = "David Chavez",
    duration = 77000
)