package com.doublesymmetry.kotlinaudio.players

import android.support.v4.media.MediaMetadataCompat
import com.google.android.exoplayer2.source.MediaSource

fun MediaSource.getMediaMetadataCompat(): MediaMetadataCompat {
    val audioItem = mediaItem.localConfiguration?.tag as com.doublesymmetry.kotlinaudio.models.AudioItem?
    val metadata = mediaItem.mediaMetadata
    val title = metadata.title ?: audioItem?.title
    val artist = metadata.artist ?: audioItem?.artist
    val albumTitle = metadata.albumTitle ?: audioItem?.albumTitle
    val duration = audioItem?.duration ?: -1
    return MediaMetadataCompat.Builder()
        .putString(MediaMetadataCompat.METADATA_KEY_ARTIST, artist.toString())
        .putString(MediaMetadataCompat.METADATA_KEY_TITLE, title.toString())
        .putString(MediaMetadataCompat.METADATA_KEY_ALBUM, albumTitle.toString())
        .putLong(MediaMetadataCompat.METADATA_KEY_DURATION, duration)
        .build()
}