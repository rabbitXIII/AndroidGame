package com.rgopal.framework.implementation;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;

import com.rgopal.framework.Music;

public class AndroidMusic implements Music, OnCompletionListener, OnSeekCompleteListener, OnPreparedListener, OnVideoSizeChangedListener{

	public AndroidMusic(AssetFileDescriptor assetDescriptor) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLooping(boolean looping) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVolume(float volume) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlaying() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStopped() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLooping() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void seekBegin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPrepared(MediaPlayer mp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSeekComplete(MediaPlayer mp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCompletion(MediaPlayer mp) {
		// TODO Auto-generated method stub
		
	}

}
