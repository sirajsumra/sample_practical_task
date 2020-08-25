package com.sample.practical.databinding;
import com.sample.practical.R;
import com.sample.practical.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingImpl extends ActivityHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.reyData, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ProgressBar) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.state == variableId) {
            setState((com.sample.practical.view.home.HomeActivityState) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.sample.practical.view.home.HomeActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setState(@Nullable com.sample.practical.view.home.HomeActivityState State) {
        this.mState = State;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.state);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.sample.practical.view.home.HomeActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeStateIsLoading((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeStateIsLoading(androidx.lifecycle.MutableLiveData<java.lang.Boolean> StateIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxStateIsLoadingGetValue = false;
        java.lang.Boolean stateIsLoadingGetValue = null;
        int stateIsLoadingViewVISIBLEViewGONE = 0;
        com.sample.practical.view.home.HomeActivityState state = mState;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> stateIsLoading = null;

        if ((dirtyFlags & 0xbL) != 0) {



                if (state != null) {
                    // read state.isLoading
                    stateIsLoading = state.isLoading();
                }
                updateLiveDataRegistration(0, stateIsLoading);


                if (stateIsLoading != null) {
                    // read state.isLoading.getValue()
                    stateIsLoadingGetValue = stateIsLoading.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(state.isLoading.getValue())
                androidxDatabindingViewDataBindingSafeUnboxStateIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(stateIsLoadingGetValue);
            if((dirtyFlags & 0xbL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxStateIsLoadingGetValue) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(state.isLoading.getValue()) ? View.VISIBLE : View.GONE
                stateIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxStateIsLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.progress.setVisibility(stateIsLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): state.isLoading
        flag 1 (0x2L): state
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(state.isLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(state.isLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}