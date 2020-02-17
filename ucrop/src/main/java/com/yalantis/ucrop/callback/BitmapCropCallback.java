package com.yalantis.ucrop.callback;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.support.annotation.NonNull;

public interface BitmapCropCallback {
    // NOTE(kleyow): Code deviating for editor purposes.
    void onBitmapCropped(@NonNull Uri resultUri, int imageWidth, int imageHeight, float currentScale, float currentAngle, RectF cropRect, RectF currentImageRect, Matrix mTempMatrix);

    void onCropFailure(@NonNull Throwable t);

}