// Generated by data binding compiler. Do not edit!
package com.sample.practical.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sample.practical.R;
import com.sample.practical.model.AlbumData;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Object;

public abstract class ItemAlbumBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivArticleImage;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected AlbumData mDataModel;

  @Bindable
  protected Integer mPosition;

  protected ItemAlbumBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivArticleImage, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivArticleImage = ivArticleImage;
    this.tvTitle = tvTitle;
  }

  public abstract void setDataModel(@Nullable AlbumData dataModel);

  @Nullable
  public AlbumData getDataModel() {
    return mDataModel;
  }

  public abstract void setPosition(@Nullable Integer position);

  @Nullable
  public Integer getPosition() {
    return mPosition;
  }

  @NonNull
  public static ItemAlbumBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_album, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemAlbumBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemAlbumBinding>inflateInternal(inflater, R.layout.item_album, root, attachToRoot, component);
  }

  @NonNull
  public static ItemAlbumBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_album, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemAlbumBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemAlbumBinding>inflateInternal(inflater, R.layout.item_album, null, false, component);
  }

  public static ItemAlbumBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemAlbumBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemAlbumBinding)bind(component, view, R.layout.item_album);
  }
}
