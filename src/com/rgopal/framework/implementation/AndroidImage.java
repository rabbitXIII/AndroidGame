package com.rgopal.framework.implementation;

import android.graphics.Bitmap;

import com.rgopal.framework.Graphics.ImageFormat;
import com.rgopal.framework.Image;

public class AndroidImage implements Image {

	public Bitmap bitmap;

	public AndroidImage(Bitmap bitmap, ImageFormat format) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ImageFormat getFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
