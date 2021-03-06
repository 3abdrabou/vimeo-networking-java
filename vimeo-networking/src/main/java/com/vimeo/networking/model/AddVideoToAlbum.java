package com.vimeo.networking.model;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * An object that is used to patch video addition updates to an Album.
 */
@SuppressWarnings("unused")
public class AddVideoToAlbum implements Serializable {

    private static final long serialVersionUID = -855083653273120166L;

    @NotNull
    @SerializedName("uri")
    private final String mUri;

    @Nullable
    @SerializedName("position")
    private final Integer mPosition;

    public AddVideoToAlbum(@NotNull String uri, @Nullable Integer position) {
        mUri = uri;
        mPosition = position;
    }

    /**
     * @return The uri for the video to be added to the album.
     */
    @NotNull
    public String getUri() {
        return mUri;
    }

    /**
     * @return The position in the album where the video should be added.
     */
    @Nullable
    public Integer getPosition() {
        return mPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || !getClass().equals(o.getClass())) { return false; }

        final AddVideoToAlbum that = (AddVideoToAlbum) o;

        if (!mUri.equals(that.mUri)) { return false; }
        return mPosition != null ? mPosition.equals(that.mPosition) : that.mPosition == null;
    }

    @Override
    public int hashCode() {
        int result = mUri.hashCode();
        result = 31 * result + (mPosition != null ? mPosition.hashCode() : 0);
        return result;
    }
}
