package com.f08movies.databinding;
import com.f08movies.R;
import com.f08movies.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBrowserTopAppBarBindingImpl extends ActivityBrowserTopAppBarBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(1, 
            new String[] {"browser_progress_bar"},
            new int[] {4},
            new int[] {com.f08movies.R.layout.browser_progress_bar});
        sIncludes.setIncludes(2, 
            new String[] {"browser_address_bar"},
            new int[] {3},
            new int[] {com.f08movies.R.layout.browser_address_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.web_view, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBrowserTopAppBarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityBrowserTopAppBarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.f08movies.databinding.BrowserAddressBarBinding) bindings[3]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.f08movies.databinding.BrowserProgressBarBinding) bindings[4]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (com.f08movies.ui.downloadmanager.ui.customview.NestedWebView) bindings[5]
            );
        setContainedBinding(this.addressBar);
        this.appBar.setTag(null);
        this.coordinatorLayout.setTag(null);
        setContainedBinding(this.progress);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        addressBar.invalidateAll();
        progress.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (addressBar.hasPendingBindings()) {
            return true;
        }
        if (progress.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.f08movies.ui.downloadmanager.ui.browser.BrowserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.f08movies.ui.downloadmanager.ui.browser.BrowserViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        addressBar.setLifecycleOwner(lifecycleOwner);
        progress.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProgress((com.f08movies.databinding.BrowserProgressBarBinding) object, fieldId);
            case 1 :
                return onChangeAddressBar((com.f08movies.databinding.BrowserAddressBarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProgress(com.f08movies.databinding.BrowserProgressBarBinding Progress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddressBar(com.f08movies.databinding.BrowserAddressBarBinding AddressBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.f08movies.ui.downloadmanager.ui.browser.BrowserViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.addressBar.setViewModel(viewModel);
            this.progress.setViewModel(viewModel);
        }
        executeBindingsOn(addressBar);
        executeBindingsOn(progress);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): progress
        flag 1 (0x2L): addressBar
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}