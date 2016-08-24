/*
 *  
 */
package utils;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 *
 * @author Billy
 */
public class Utility {
    /**
     * Draws a health bar
     */
    public static void drawHealthBar(ShapeRenderer renderer, float x1, float y1,
            float w, float h, float percentage, Color color0, Color color1, Color back) {
        
        renderer.rect(x1,y1,w,h, back,back,back,back);
        Color progColor = color0.lerp(color1, percentage);
        w = w*percentage;
        renderer.rect(x1+1,y1+1,w-2,h-2,progColor,progColor,progColor,progColor);
    }
}
