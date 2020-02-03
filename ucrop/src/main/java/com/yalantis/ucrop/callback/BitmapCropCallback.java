package com.yalantis.ucrop.callback;

import android.net.Uri;
import android.support.annotation.NonNull;

public interface BitmapCropCallback {
    // NOTE(kleyow): Code deviating for editor purposes.
    void onBitmapCropped(@NonNull Uri resultUri, int imageWidth, int imageHeight, float mCurrentScale, float currentAngle);

    void onCropFailure(@NonNull Throwable t);

}