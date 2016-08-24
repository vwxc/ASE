package com.subspace.cerebria.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.subspace.cerebria.CerebriaGame;

/**
 *
 * @author Billy
 */
public abstract class BaseScreen implements Screen{
    protected final OrthographicCamera camera;
    protected final CerebriaGame game;
    protected final SpriteBatch batch;
    protected Color clearColor;
    
    public void setClearColor(Color color) {
        clearColor = color;
    }
    
    public OrthographicCamera getCamera() {
        return camera;
    }
    
    public CerebriaGame getGame() {
        return game;
    }
    
    public BaseScreen(CerebriaGame game) {
        this.game=game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, CerebriaGame.WIDTH, CerebriaGame.HEIGHT);
        batch = game.getSpriteBatch();
    }
    
    @Override
    public void show() {
        
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(clearColor.r,clearColor.g,clearColor.b,clearColor.a);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        this.update(delta);
        
        batch.setProjectionMatrix(camera.combined);
        this.draw(delta);
    }

    @Override
    public void resize(int w, int h) {
        
    }

    @Override
    public void pause() {
        
    }
    
    public void update(float delta) {
        camera.update();
    }
    
    public void draw(float delta) {
        
    }

    @Override
    public void resume() {
        
    }

    @Override
    public void hide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
