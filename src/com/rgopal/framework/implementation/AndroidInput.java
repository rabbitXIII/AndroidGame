package com.rgopal.framework.implementation;

import java.util.List;

import com.rgopal.framework.Input;

public class AndroidInput implements Input {

	public AndroidInput(AndroidGame androidGame,
			AndroidFastRenderView renderView, float scaleX, float scaleY) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isTouchDown(int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getTouchX(int pointer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTouchY(int pointer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TouchEvent> getTouchEvents() {
		// TODO Auto-generated method stub
		return null;
	}

}
