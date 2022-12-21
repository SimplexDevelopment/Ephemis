package io.github.simplexdevelopment.api;

import com.jme3.asset.TextureKey;
import com.jme3.texture.*;

public interface Texturable {
    Texture getTexture();

    void setTexture(Texture texture);

    Texture3D getTexture3D();

    Texture2D getTexture2D();

    TextureKey getTextureKey();

    TextureProcessor getTextureProcessor();

    TextureArray getTextureArray();

    TextureCubeMap getTextureCubeMap();
}
