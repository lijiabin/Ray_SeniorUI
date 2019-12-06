/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.baopengjian.ray_seniorui.twenty_third.extension.v4.animation;

import android.view.View;

/**
 * Compatibility implementation for {@code android.animation.ValueAnimator}.
 *
 * @hide
 */
public interface ValueAnimatorCompat {

    public void setTarget(View view);

    public void addListener(AnimatorListenerCompat listener);

    public void setDuration(long duration);

    public void start();

    public void cancel();

    void addUpdateListener(AnimatorUpdateListenerCompat animatorUpdateListener);

    public float getAnimatedFraction();
}
