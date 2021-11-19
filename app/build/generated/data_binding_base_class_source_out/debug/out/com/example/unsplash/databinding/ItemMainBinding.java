// Generated by view binder compiler. Do not edit!
package com.example.unsplash.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.unsplash.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonLike;

  @NonNull
  public final ImageView ivImg;

  @NonNull
  public final TextView tvAuthor;

  @NonNull
  public final TextView tvLikeCount;

  private ItemMainBinding(@NonNull LinearLayout rootView, @NonNull Button buttonLike,
      @NonNull ImageView ivImg, @NonNull TextView tvAuthor, @NonNull TextView tvLikeCount) {
    this.rootView = rootView;
    this.buttonLike = buttonLike;
    this.ivImg = ivImg;
    this.tvAuthor = tvAuthor;
    this.tvLikeCount = tvLikeCount;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonLike;
      Button buttonLike = ViewBindings.findChildViewById(rootView, id);
      if (buttonLike == null) {
        break missingId;
      }

      id = R.id.ivImg;
      ImageView ivImg = ViewBindings.findChildViewById(rootView, id);
      if (ivImg == null) {
        break missingId;
      }

      id = R.id.tvAuthor;
      TextView tvAuthor = ViewBindings.findChildViewById(rootView, id);
      if (tvAuthor == null) {
        break missingId;
      }

      id = R.id.tvLike_count;
      TextView tvLikeCount = ViewBindings.findChildViewById(rootView, id);
      if (tvLikeCount == null) {
        break missingId;
      }

      return new ItemMainBinding((LinearLayout) rootView, buttonLike, ivImg, tvAuthor, tvLikeCount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
