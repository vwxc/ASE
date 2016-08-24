package com.subspace.cerebria.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.subspace.cerebria.CerebriaGame;
import utils.Utility;

/**
 *
 * @author Billy
 */
public class MainMenuScreen extends BaseScreen {
    
    public MainMenuScreen(CerebriaGame game) {
        super(game);
        Color color = new Color(0x6495EDFF);
        this.setClearColor(color);
    }
    
    boolean touched  = false;
    
    @Override
    public void update(float delta) {
        super.update(delta);

        if(Gdx.input.isTouched() && !touched) {
            CerebriaGame.score += 1;
            touched = true;
        } else if(!Gdx.input.isTouched() && touched) 
            touched = false;
    }
    
    @Override
    public void draw(float delta) {
        batch.begin();
        game.drawScore(10, 470);
        batch.end();
    }
    
    @Override
    public void dispose() {
        
    }
}
