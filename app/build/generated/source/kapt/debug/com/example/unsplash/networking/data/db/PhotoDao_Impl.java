package com.example.unsplash.networking.data.db;

import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.unsplash.networking.data.models.Photo;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PhotoDao_Impl implements PhotoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Photo> __insertionAdapterOfPhoto;

  private final EntityDeletionOrUpdateAdapter<Photo> __updateAdapterOfPhoto;

  public PhotoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPhoto = new EntityInsertionAdapter<Photo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `photos` (`id`,`alt_description`,`urls`,`raw`,`liked_by_user`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Photo value) {
        stmt.bindLong(1, value.getId());
        if (value.getAlt_description() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAlt_description());
        }
        if (value.getUrls() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrls());
        }
        stmt.bindLong(4, value.getLikes());
        final int _tmp;
        _tmp = value.getLiked_by_user() ? 1 : 0;
        stmt.bindLong(5, _tmp);
      }
    };
    this.__updateAdapterOfPhoto = new EntityDeletionOrUpdateAdapter<Photo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `photos` SET `id` = ?,`alt_description` = ?,`urls` = ?,`raw` = ?,`liked_by_user` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Photo value) {
        stmt.bindLong(1, value.getId());
        if (value.getAlt_description() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAlt_description());
        }
        if (value.getUrls() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrls());
        }
        stmt.bindLong(4, value.getLikes());
        final int _tmp;
        _tmp = value.getLiked_by_user() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public Object insertPhotos(final List<Photo> photos,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPhoto.insert(photos);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updatePhoto(final Photo photo, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfPhoto.handle(photo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
