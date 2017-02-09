package chat.rocket.android.model.core;

import com.google.auto.value.AutoValue;

import android.support.annotation.Nullable;

import java.util.List;

@AutoValue
public abstract class Message {

  public abstract String getId();

  @Nullable
  public abstract String getType();

  public abstract String getRoomId();

  public abstract int getSyncState();

  public abstract long getTimestamp();

  public abstract String getMessage();

  public abstract User getUser();

  public abstract boolean isGroupable();

  @Nullable
  public abstract List<Attachment> getAttachments();

  @Nullable
  public abstract List<WebContent> getWebContents();

  @Nullable
  public abstract String getAlias();

  @Nullable
  public abstract String getAvatar();

  public static Builder builder() {
    return new AutoValue_Message.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setId(String id);

    public abstract Builder setType(String type);

    public abstract Builder setRoomId(String roomId);

    public abstract Builder setSyncState(int syncState);

    public abstract Builder setTimestamp(long timestamp);

    public abstract Builder setMessage(String msg);

    public abstract Builder setUser(User user);

    public abstract Builder setGroupable(boolean groupable);

    public abstract Builder setAttachments(List<Attachment> attachments);

    public abstract Builder setWebContents(List<WebContent> webContents);

    public abstract Builder setAlias(String alias);

    public abstract Builder setAvatar(String avatar);

    public abstract Message build();
  }
}