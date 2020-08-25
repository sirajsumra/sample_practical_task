package com.sample.practical.databinding;
import com.sample.practical.R;
import com.sample.practical.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAlbumBindingImpl extends ItemAlbumBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAlbumBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemAlbumBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.ivArticleImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.dataModel == variableId) {
            setDataModel((com.sample.practical.model.AlbumData) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDataModel(@Nullable com.sample.practical.model.AlbumData DataModel) {
        this.mDataModel = DataModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dataModel);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.sample.practical.model.AlbumData dataModel = mDataModel;
        java.lang.String dataModelThumbnailUrlTrim = null;
        java.lang.String dataModelThumbnailUrl = null;
        java.lang.String dataModelTitle = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (dataModel != null) {
                    // read dataModel.thumbnailUrl
                    dataModelThumbnailUrl = dataModel.getThumbnailUrl();
                    // read dataModel.title
                    dataModelTitle = dataModel.getTitle();
                }


                if (dataModelThumbnailUrl != null) {
                    // read dataModel.thumbnailUrl.trim()
                    dataModelThumbnailUrlTrim = dataModelThumbnailUrl.trim();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.sample.practical.model.AlbumData.setImageUrl(this.ivArticleImage, dataModelThumbnailUrlTrim);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, dataModelTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dataModel
        flag 1 (0x2L): position
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}