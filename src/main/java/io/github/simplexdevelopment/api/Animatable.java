package io.github.simplexdevelopment.api;

import com.jme3.anim.AnimationMask;
import com.jme3.animation.AnimationUtils;
import com.simsilica.lemur.anim.Animation;
import com.simsilica.lemur.anim.AnimationState;

public interface Animatable {
    Animation getAnimation();

    AnimationState getAnimationState();

    AnimationMask getAnimationMask();

    AnimationUtils getAnimationUtils();

    void setAnimation(Animation animation);

    void setAnimationState(AnimationState animationState);

    void setAnimationMask(AnimationMask animationMask);
}
