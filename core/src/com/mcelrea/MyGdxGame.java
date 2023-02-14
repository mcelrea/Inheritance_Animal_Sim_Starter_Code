package com.mcelrea;

/*
 * If you are using Intellij idea, this might help:
 *    Settings -> Build, Execution, Deployment ->
 *                Gradle ->
 *                Build and run using: IntelliJ IDEA
 */

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);



		//MUST draw all graphics between begin() and end()
		batch.begin();
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
