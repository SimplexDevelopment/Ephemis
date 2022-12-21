package io.github.simplexdevelopment.main.entity;

import com.jme3.anim.AnimationMask;
import com.jme3.animation.AnimationUtils;
import com.jme3.asset.ModelKey;
import com.jme3.asset.TextureKey;
import com.jme3.bounding.BoundingBox;
import com.jme3.math.Spline;
import com.jme3.texture.*;
import com.simsilica.lemur.anim.Animation;
import com.simsilica.lemur.anim.AnimationState;
import io.github.simplexdevelopment.api.Displayable;
import io.github.simplexdevelopment.api.annotations.AnimationFile;
import io.github.simplexdevelopment.api.annotations.SoundFile;
import io.github.simplexdevelopment.api.annotations.TextureFile;
import io.github.simplexdevelopment.api.asset.BasicGUI;
import io.github.simplexdevelopment.api.asset.Vehicle;
import io.github.simplexdevelopment.api.effects.Status;
import io.github.simplexdevelopment.api.entity.Player;
import io.github.simplexdevelopment.api.inventory.PlayerInventory;
import io.github.simplexdevelopment.api.mappings.Location;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

@TextureFile("assets/textures/player.png")
@SoundFile("assets/sounds/player.wav")
@AnimationFile("assets/animations/player.anim")
public class PlayerEntity implements Player {
    @Override
    public Animation getAnimation() {
        return null;
    }

    @Override
    public AnimationState getAnimationState() {
        return null;
    }

    @Override
    public AnimationMask getAnimationMask() {
        return null;
    }

    @Override
    public AnimationUtils getAnimationUtils() {
        return null;
    }

    @Override
    public void setAnimation(Animation animation) {

    }

    @Override
    public void setAnimationState(AnimationState animationState) {

    }

    @Override
    public void setAnimationMask(AnimationMask animationMask) {

    }

    @Override
    public PlayerEntity cloned() {
        return null;
    }

    @Override
    public ModelKey getModelKey() {
        return null;
    }

    @Override
    public Spline getSplineAtIndex(int index) {
        return null;
    }

    @Override
    public Collection<Spline> getSplines() {
        return null;
    }

    @Override
    public Spline.SplineType getSplineType() {
        return null;
    }

    @Override
    public Texture getTexture() {
        return null;
    }

    @Override
    public void setTexture(Texture texture) {

    }

    @Override
    public Texture3D getTexture3D() {
        return null;
    }

    @Override
    public Texture2D getTexture2D() {
        return null;
    }

    @Override
    public TextureKey getTextureKey() {
        return null;
    }

    @Override
    public TextureProcessor getTextureProcessor() {
        return null;
    }

    @Override
    public TextureArray getTextureArray() {
        return null;
    }

    @Override
    public TextureCubeMap getTextureCubeMap() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public BoundingBox getCollisionBox() {
        return null;
    }

    @Override
    public Location getLocation() {
        return null;
    }

    @Override
    public void setLocation(Location location) {

    }

    @Override
    public void setLocation(int x, int y, int z, float pitch, float yaw) {

    }

    @Override
    public void setCollisionBox(BoundingBox boundingBox) {

    }

    @Override
    public double getHealth() {
        return 0;
    }

    @Override
    public void setHealth(double health) {

    }

    @Override
    public void damage(double damage) {

    }

    @Override
    public void heal(double heal) {

    }

    @Override
    public @Nullable Status[] getStatusEffects() {
        return new Status[0];
    }

    @Override
    public @Nullable Vehicle getCurrentVehicle() {
        return null;
    }

    @Override
    public @NotNull Displayable getDisplayable() {
        return null;
    }

    @Override
    public @NotNull BasicGUI getGUI() {
        return null;
    }

    @Override
    public @NotNull PlayerInventory getInventory() {
        return null;
    }
}
