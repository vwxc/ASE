package com.subspace.cerebria.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.subspace.cerebria.CerebriaGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.title = "Cerebria";
                config.width = 800;
                config.height = 480;
		new LwjglApplication(new CerebriaGame(), config);
	}
}
