package com.subspace.cerebria;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.subspace.cerebria.screens.MainMenuScreen;

public class CerebriaGame extends Game {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 480;

    public static float score = 0;
    
    private SpriteBatch batch;
    private ShapeRenderer shapeRenderer;
    private BitmapFont scoreFont;
    
    public ShapeRenderer getShapeRenderer() {
        return shapeRenderer;
    }
    
    public SpriteBatch getSpriteBatch() {
        return batch;
    }

    @Override
    public void create () {
            batch = new SpriteBatch();
            shapeRenderer = new ShapeRenderer();
            
            // GENERATE SCORE FONT
            FreeTypeFontGenerator gen = new FreeTypeFontGenerator(Gdx.files.internal("ARCADECLASSIC.TTF"));
            FreeTypeFontParameter param = new FreeTypeFontParameter();
            param.size = 45;
            param.borderColor = Color.BLACK;
            param.color = Color.YELLOW;
            
            scoreFont = gen.generateFont(param);
            gen.dispose();
            
            // set to main screen
            setScreen(new MainMenuScreen(this));
    }

    @Override
    public void dispose () {
            batch.dispose();
            shapeRenderer.dispose();
    }
    
    public void drawScore(float x, float y) {
        Integer ss = (int)CerebriaGame.score;
        scoreFont.draw(batch, ss.toString(), x, y);
    }
}
