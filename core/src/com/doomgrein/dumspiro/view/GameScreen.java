package com.doomgrein.dumspiro.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.doomgrein.dumspiro.model.Bucket;

public class GameScreen implements Screen {

    private Texture bucketTexture;
    private SpriteBatch batch;
    private Bucket bucket;

    @Override
    public void show() {
        // Когда в игре переключаемся на этот экран
        batch = new SpriteBatch();
        bucketTexture = new Texture(Gdx.files.internal("bucket.png"));
        bucket = new Bucket(bucketTexture, 31, 0,64,64);
    }

    @Override
    public void render(float delta) {
        // Итеративный цикл, вызывается постоянно. float delta - время между кадрами (в секундах)
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        bucket.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        // При изменении размера экрана игры
    }

    @Override
    public void pause() {
        // Вызывается при сворачивании игры
    }

    @Override
    public void resume() {
        // Вызывается при разворачивании игры
    }

    @Override
    public void hide() {
        // Переключение на другой экран в игре. Например, из меню - в игру.
    }

    @Override
    public void dispose() {
        // Вызывается при закрытии игры. Уничтожаем здесь все объекты игры. Освобождаем ресурсы.
        bucketTexture.dispose();
        batch.dispose();
    }
}
