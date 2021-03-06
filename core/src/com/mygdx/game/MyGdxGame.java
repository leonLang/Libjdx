package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int x;
	
	@Override
	public void create () {
		//hi
        //jajaja
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		x++;
		batch.draw(img,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		batch.draw(img,x, 0,100,100);
		//hi
		if(Gdx.graphics.getWidth() < x + img.getWidth()){
			x=0;
		}
		batch.end();
	}
	//test
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
