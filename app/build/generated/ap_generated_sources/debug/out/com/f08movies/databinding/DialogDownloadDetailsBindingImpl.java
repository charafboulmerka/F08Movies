package com.f08movies.databinding;
import com.f08movies.R;
import com.f08movies.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogDownloadDetailsBindingImpl extends DialogDownloadDetailsBinding implements com.f08movies.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_link, 25);
        sViewsWithIds.put(R.id.layout_name, 26);
        sViewsWithIds.put(R.id.layout_description, 27);
        sViewsWithIds.put(R.id.layout_save_path, 28);
        sViewsWithIds.put(R.id.folder_chooser_button, 29);
        sViewsWithIds.put(R.id.checksum_title, 30);
        sViewsWithIds.put(R.id.layout_checksum, 31);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView16;
    @NonNull
    private final android.widget.LinearLayout mboundView20;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener checksumandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mutableParams.checksum
            //         is viewModel.mutableParams.setChecksum((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(checksum);
            // localize variables for thread safety
            // viewModel.mutableParams.checksum
            java.lang.String viewModelMutableParamsChecksum = null;
            // viewModel.mutableParams
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsMutableParams viewModelMutableParams = null;
            // viewModel
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.mutableParams != null
            boolean viewModelMutableParamsJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMutableParams = viewModel.mutableParams;

                viewModelMutableParamsJavaLangObjectNull = (viewModelMutableParams) != (null);
                if (viewModelMutableParamsJavaLangObjectNull) {




                    viewModelMutableParams.setChecksum(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener descriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mutableParams.description
            //         is viewModel.mutableParams.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(description);
            // localize variables for thread safety
            // viewModel.mutableParams
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsMutableParams viewModelMutableParams = null;
            // viewModel
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.mutableParams.description
            java.lang.String viewModelMutableParamsDescription = null;
            // viewModel.mutableParams != null
            boolean viewModelMutableParamsJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMutableParams = viewModel.mutableParams;

                viewModelMutableParamsJavaLangObjectNull = (viewModelMutableParams) != (null);
                if (viewModelMutableParamsJavaLangObjectNull) {




                    viewModelMutableParams.setDescription(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener linkandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mutableParams.url
            //         is viewModel.mutableParams.setUrl((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(link);
            // localize variables for thread safety
            // viewModel.mutableParams
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsMutableParams viewModelMutableParams = null;
            // viewModel
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel viewModel = mViewModel;
            // viewModel.mutableParams.url
            java.lang.String viewModelMutableParamsUrl = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.mutableParams != null
            boolean viewModelMutableParamsJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMutableParams = viewModel.mutableParams;

                viewModelMutableParamsJavaLangObjectNull = (viewModelMutableParams) != (null);
                if (viewModelMutableParamsJavaLangObjectNull) {




                    viewModelMutableParams.setUrl(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener nameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mutableParams.fileName
            //         is viewModel.mutableParams.setFileName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(name);
            // localize variables for thread safety
            // viewModel.mutableParams
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsMutableParams viewModelMutableParams = null;
            // viewModel.mutableParams.fileName
            java.lang.String viewModelMutableParamsFileName = null;
            // viewModel
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.mutableParams != null
            boolean viewModelMutableParamsJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMutableParams = viewModel.mutableParams;

                viewModelMutableParamsJavaLangObjectNull = (viewModelMutableParams) != (null);
                if (viewModelMutableParamsJavaLangObjectNull) {




                    viewModelMutableParams.setFileName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener retryandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mutableParams.retry
            //         is viewModel.mutableParams.setRetry((boolean) callbackArg_0)
            boolean callbackArg_0 = retry.isChecked();
            // localize variables for thread safety
            // viewModel.mutableParams.retry
            boolean viewModelMutableParamsRetry = false;
            // viewModel.mutableParams
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsMutableParams viewModelMutableParams = null;
            // viewModel
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.mutableParams != null
            boolean viewModelMutableParamsJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMutableParams = viewModel.mutableParams;

                viewModelMutableParamsJavaLangObjectNull = (viewModelMutableParams) != (null);
                if (viewModelMutableParamsJavaLangObjectNull) {




                    viewModelMutableParams.setRetry(((boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener unmeteredConnectionsOnlyandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mutableParams.unmeteredConnectionsOnly
            //         is viewModel.mutableParams.setUnmeteredConnectionsOnly((boolean) callbackArg_0)
            boolean callbackArg_0 = unmeteredConnectionsOnly.isChecked();
            // localize variables for thread safety
            // viewModel.mutableParams
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsMutableParams viewModelMutableParams = null;
            // viewModel
            com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.mutableParams != null
            boolean viewModelMutableParamsJavaLangObjectNull = false;
            // viewModel.mutableParams.unmeteredConnectionsOnly
            boolean viewModelMutableParamsUnmeteredConnectionsOnly = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMutableParams = viewModel.mutableParams;

                viewModelMutableParamsJavaLangObjectNull = (viewModelMutableParams) != (null);
                if (viewModelMutableParamsJavaLangObjectNull) {




                    viewModelMutableParams.setUnmeteredConnectionsOnly(((boolean) (callbackArg_0)));
                }
            }
        }
    };

    public DialogDownloadDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }
    private DialogDownloadDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.button.MaterialButton) bindings[17]
            , (com.google.android.material.button.MaterialButton) bindings[21]
            , (com.f08movies.ui.downloadmanager.ui.customview.FixHintTextInputEditText) bindings[14]
            , (android.widget.ImageButton) bindings[15]
            , (android.widget.TextView) bindings[30]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.TextView) bindings[13]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageButton) bindings[29]
            , (android.widget.TextView) bindings[8]
            , (androidx.core.widget.ContentLoadingProgressBar) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[31]
            , (com.google.android.material.textfield.TextInputLayout) bindings[27]
            , (com.google.android.material.textfield.TextInputLayout) bindings[25]
            , (com.google.android.material.textfield.TextInputLayout) bindings[26]
            , (com.google.android.material.textfield.TextInputLayout) bindings[28]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (android.widget.TextView) bindings[19]
            , (androidx.core.widget.ContentLoadingProgressBar) bindings[18]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.CheckBox) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (android.widget.TextView) bindings[23]
            , (androidx.core.widget.ContentLoadingProgressBar) bindings[22]
            , (android.widget.CheckBox) bindings[9]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.TextView) bindings[24]
            );
        this.calculateMd5Hash.setTag(null);
        this.calculateSha256Hash.setTag(null);
        this.checksum.setTag(null);
        this.checksumClipboardButton.setTag(null);
        this.content.setTag(null);
        this.dateAdded.setTag(null);
        this.description.setTag(null);
        this.downloaded.setTag(null);
        this.freeSpace.setTag(null);
        this.initProgress.setTag(null);
        this.link.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView16 = (android.widget.LinearLayout) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView20 = (android.widget.LinearLayout) bindings[20];
        this.mboundView20.setTag(null);
        this.md5Hash.setTag(null);
        this.md5HashProgress.setTag(null);
        this.name.setTag(null);
        this.numPieces.setTag(null);
        this.retry.setTag(null);
        this.savePath.setTag(null);
        this.sha256Hash.setTag(null);
        this.sha256HashProgress.setTag(null);
        this.unmeteredConnectionsOnly.setTag(null);
        this.urlClipboardButton.setTag(null);
        this.userAgent.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.f08movies.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.f08movies.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40000L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelShowClipboardButton((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelMutableParams((com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsMutableParams) object, fieldId);
            case 2 :
                return onChangeViewModelInfo((com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowClipboardButton(androidx.databinding.ObservableBoolean ViewModelShowClipboardButton, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMutableParams(com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsMutableParams ViewModelMutableParams, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.url) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.fileName) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.description) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.unmeteredConnectionsOnly) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.retry) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.checksum) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelInfo(com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo ViewModelInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.downloadInfo) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.dirName) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.storageFreeSpace) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        else if (fieldId == BR.downloadedBytes) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        else if (fieldId == BR.md5State) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        else if (fieldId == BR.md5Hash) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        else if (fieldId == BR.sha256State) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        else if (fieldId == BR.sha256Hash) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
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
        java.lang.String viewModelInfoDirName = null;
        java.lang.String viewModelInfoMd5Hash = null;
        java.lang.String viewModelMutableParamsUrl = null;
        boolean viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATED = false;
        boolean viewModelInfoDownloadInfoJavaLangObjectNull = false;
        boolean viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATED = false;
        java.lang.String viewModelMutableParamsChecksum = null;
        com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState viewModelInfoMd5State = null;
        int viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATEDViewVISIBLEViewGONE = 0;
        boolean viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWN = false;
        java.lang.String viewModelInfoSha256Hash = null;
        int viewModelShowClipboardButtonViewVISIBLEViewGONE = 0;
        int viewModelInfoDownloadInfoNumPieces = 0;
        boolean viewModelShowClipboardButtonGet = false;
        long viewModelInfoStorageFreeSpace = 0;
        java.lang.String stringValueOfViewModelInfoDownloadInfoNumPieces = null;
        boolean viewModelMutableParamsRetry = false;
        com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState viewModelInfoSha256State = null;
        int viewModelInfoDownloadInfoJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String bindingAdapterUtilsFormatProgressContextViewModelInfoDownloadedBytesViewModelInfoDownloadInfoTotalBytesDownloadedAndroidStringDetailDownloadedFormat = null;
        boolean statusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCode = false;
        long viewModelInfoDownloadInfoTotalBytes = 0;
        int viewModelInfoDownloadInfoJavaLangObjectNullStatusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCodeBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelMutableParamsDescription = null;
        int viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWNViewVISIBLEViewGONE = 0;
        boolean viewModelInfoSha256HashJavaLangObjectNull = false;
        int viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATEDViewVISIBLEViewGONE = 0;
        int viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWNViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean viewModelShowClipboardButton = null;
        boolean viewModelMutableParamsUnmeteredConnectionsOnly = false;
        boolean ViewModelInfoDownloadInfoJavaLangObjectNull1 = false;
        com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsMutableParams viewModelMutableParams = null;
        java.lang.String viewModelMutableParamsFileName = null;
        int viewModelInfoDownloadInfoStatusCode = 0;
        long viewModelInfoDownloadInfoDateAdded = 0;
        int viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATIONViewVISIBLEViewGONE = 0;
        java.lang.String viewModelInfoDownloadInfoUserAgent = null;
        boolean viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATION = false;
        boolean viewModelInfoMd5HashJavaLangObjectNull = false;
        long viewModelInfoDownloadedBytes = 0;
        java.lang.String viewModelInfoSha256HashJavaLangObjectNullSha256HashAndroidStringNotAvailableViewModelInfoSha256Hash = null;
        int viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATIONViewVISIBLEViewGONE = 0;
        java.lang.String viewModelInfoMd5HashJavaLangObjectNullMd5HashAndroidStringNotAvailableViewModelInfoMd5Hash = null;
        int viewModelInfoDownloadInfoJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATION = false;
        boolean viewModelInfoDownloadInfoJavaLangObjectNullStatusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCodeBooleanFalse = false;
        com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo viewModelInfo = null;
        boolean viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWN = false;
        com.f08movies.ui.downloadmanager.core.model.data.entity.DownloadInfo viewModelInfoDownloadInfo = null;
        com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7ffffL) != 0) {


            if ((dirtyFlags & 0x40009L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showClipboardButton
                        viewModelShowClipboardButton = viewModel.showClipboardButton;
                    }
                    updateRegistration(0, viewModelShowClipboardButton);


                    if (viewModelShowClipboardButton != null) {
                        // read viewModel.showClipboardButton.get()
                        viewModelShowClipboardButtonGet = viewModelShowClipboardButton.get();
                    }
                if((dirtyFlags & 0x40009L) != 0) {
                    if(viewModelShowClipboardButtonGet) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read viewModel.showClipboardButton.get() ? View.VISIBLE : View.GONE
                    viewModelShowClipboardButtonViewVISIBLEViewGONE = ((viewModelShowClipboardButtonGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x403faL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mutableParams
                        viewModelMutableParams = viewModel.mutableParams;
                    }
                    updateRegistration(1, viewModelMutableParams);

                if ((dirtyFlags & 0x4001aL) != 0) {

                        if (viewModelMutableParams != null) {
                            // read viewModel.mutableParams.url
                            viewModelMutableParamsUrl = viewModelMutableParams.getUrl();
                        }
                }
                if ((dirtyFlags & 0x4020aL) != 0) {

                        if (viewModelMutableParams != null) {
                            // read viewModel.mutableParams.checksum
                            viewModelMutableParamsChecksum = viewModelMutableParams.getChecksum();
                        }
                }
                if ((dirtyFlags & 0x4010aL) != 0) {

                        if (viewModelMutableParams != null) {
                            // read viewModel.mutableParams.retry
                            viewModelMutableParamsRetry = viewModelMutableParams.isRetry();
                        }
                }
                if ((dirtyFlags & 0x4004aL) != 0) {

                        if (viewModelMutableParams != null) {
                            // read viewModel.mutableParams.description
                            viewModelMutableParamsDescription = viewModelMutableParams.getDescription();
                        }
                }
                if ((dirtyFlags & 0x4008aL) != 0) {

                        if (viewModelMutableParams != null) {
                            // read viewModel.mutableParams.unmeteredConnectionsOnly
                            viewModelMutableParamsUnmeteredConnectionsOnly = viewModelMutableParams.isUnmeteredConnectionsOnly();
                        }
                }
                if ((dirtyFlags & 0x4002aL) != 0) {

                        if (viewModelMutableParams != null) {
                            // read viewModel.mutableParams.fileName
                            viewModelMutableParamsFileName = viewModelMutableParams.getFileName();
                        }
                }
            }
            if ((dirtyFlags & 0x7fc0cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.info
                        viewModelInfo = viewModel.info;
                    }
                    updateRegistration(2, viewModelInfo);

                if ((dirtyFlags & 0x4080cL) != 0) {

                        if (viewModelInfo != null) {
                            // read viewModel.info.dirName
                            viewModelInfoDirName = viewModelInfo.getDirName();
                        }
                }
                if ((dirtyFlags & 0x4800cL) != 0) {

                        if (viewModelInfo != null) {
                            // read viewModel.info.md5Hash
                            viewModelInfoMd5Hash = viewModelInfo.getMd5Hash();
                        }


                        // read viewModel.info.md5Hash == null
                        viewModelInfoMd5HashJavaLangObjectNull = (viewModelInfoMd5Hash) == (null);
                    if((dirtyFlags & 0x4800cL) != 0) {
                        if(viewModelInfoMd5HashJavaLangObjectNull) {
                                dirtyFlags |= 0x10000000000L;
                        }
                        else {
                                dirtyFlags |= 0x8000000000L;
                        }
                    }
                }
                if ((dirtyFlags & 0x4400cL) != 0) {

                        if (viewModelInfo != null) {
                            // read viewModel.info.md5State
                            viewModelInfoMd5State = viewModelInfo.getMd5State();
                        }


                        // read viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATED
                        viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATED = (viewModelInfoMd5State) == (com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATED);
                        // read viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATION
                        viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATION = (viewModelInfoMd5State) == (com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATION);
                        // read viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.UNKNOWN
                        viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWN = (viewModelInfoMd5State) == (com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.UNKNOWN);
                    if((dirtyFlags & 0x4400cL) != 0) {
                        if(viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATED) {
                                dirtyFlags |= 0x40000000L;
                        }
                        else {
                                dirtyFlags |= 0x20000000L;
                        }
                    }
                    if((dirtyFlags & 0x4400cL) != 0) {
                        if(viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATION) {
                                dirtyFlags |= 0x4000000000L;
                        }
                        else {
                                dirtyFlags |= 0x2000000000L;
                        }
                    }
                    if((dirtyFlags & 0x4400cL) != 0) {
                        if(viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWN) {
                                dirtyFlags |= 0x100000000L;
                        }
                        else {
                                dirtyFlags |= 0x80000000L;
                        }
                    }


                        // read viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATED ? View.VISIBLE : View.GONE
                        viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATEDViewVISIBLEViewGONE = ((viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATED) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATION ? View.VISIBLE : View.GONE
                        viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATIONViewVISIBLEViewGONE = ((viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATION) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.UNKNOWN ? View.VISIBLE : View.GONE
                        viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWNViewVISIBLEViewGONE = ((viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWN) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x6000cL) != 0) {

                        if (viewModelInfo != null) {
                            // read viewModel.info.sha256Hash
                            viewModelInfoSha256Hash = viewModelInfo.getSha256Hash();
                        }


                        // read viewModel.info.sha256Hash == null
                        viewModelInfoSha256HashJavaLangObjectNull = (viewModelInfoSha256Hash) == (null);
                    if((dirtyFlags & 0x6000cL) != 0) {
                        if(viewModelInfoSha256HashJavaLangObjectNull) {
                                dirtyFlags |= 0x1000000000L;
                        }
                        else {
                                dirtyFlags |= 0x800000000L;
                        }
                    }
                }
                if ((dirtyFlags & 0x4100cL) != 0) {

                        if (viewModelInfo != null) {
                            // read viewModel.info.storageFreeSpace
                            viewModelInfoStorageFreeSpace = viewModelInfo.getStorageFreeSpace();
                        }
                }
                if ((dirtyFlags & 0x5000cL) != 0) {

                        if (viewModelInfo != null) {
                            // read viewModel.info.sha256State
                            viewModelInfoSha256State = viewModelInfo.getSha256State();
                        }


                        // read viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATED
                        viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATED = (viewModelInfoSha256State) == (com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATED);
                        // read viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.UNKNOWN
                        viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWN = (viewModelInfoSha256State) == (com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.UNKNOWN);
                        // read viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATION
                        viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATION = (viewModelInfoSha256State) == (com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATION);
                    if((dirtyFlags & 0x5000cL) != 0) {
                        if(viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATED) {
                                dirtyFlags |= 0x100000L;
                        }
                        else {
                                dirtyFlags |= 0x80000L;
                        }
                    }
                    if((dirtyFlags & 0x5000cL) != 0) {
                        if(viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWN) {
                                dirtyFlags |= 0x10000000L;
                        }
                        else {
                                dirtyFlags |= 0x8000000L;
                        }
                    }
                    if((dirtyFlags & 0x5000cL) != 0) {
                        if(viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATION) {
                                dirtyFlags |= 0x400000000L;
                        }
                        else {
                                dirtyFlags |= 0x200000000L;
                        }
                    }


                        // read viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATED ? View.VISIBLE : View.GONE
                        viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATEDViewVISIBLEViewGONE = ((viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATED) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.UNKNOWN ? View.VISIBLE : View.GONE
                        viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWNViewVISIBLEViewGONE = ((viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWN) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATION ? View.VISIBLE : View.GONE
                        viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATIONViewVISIBLEViewGONE = ((viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATION) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x4240cL) != 0) {

                        if (viewModelInfo != null) {
                            // read viewModel.info.downloadedBytes
                            viewModelInfoDownloadedBytes = viewModelInfo.getDownloadedBytes();
                            // read viewModel.info.downloadInfo
                            viewModelInfoDownloadInfo = viewModelInfo.getDownloadInfo();
                        }

                    if ((dirtyFlags & 0x4040cL) != 0) {

                            // read viewModel.info.downloadInfo == null
                            viewModelInfoDownloadInfoJavaLangObjectNull = (viewModelInfoDownloadInfo) == (null);
                            // read viewModel.info.downloadInfo != null
                            ViewModelInfoDownloadInfoJavaLangObjectNull1 = (viewModelInfoDownloadInfo) != (null);
                        if((dirtyFlags & 0x4040cL) != 0) {
                            if(viewModelInfoDownloadInfoJavaLangObjectNull) {
                                    dirtyFlags |= 0x1000000L;
                                    dirtyFlags |= 0x40000000000L;
                            }
                            else {
                                    dirtyFlags |= 0x800000L;
                                    dirtyFlags |= 0x20000000000L;
                            }
                        }
                        if((dirtyFlags & 0x4040cL) != 0) {
                            if(ViewModelInfoDownloadInfoJavaLangObjectNull1) {
                                    dirtyFlags |= 0x100000000000L;
                            }
                            else {
                                    dirtyFlags |= 0x80000000000L;
                            }
                        }
                            if (viewModelInfoDownloadInfo != null) {
                                // read viewModel.info.downloadInfo.numPieces
                                viewModelInfoDownloadInfoNumPieces = viewModelInfoDownloadInfo.getNumPieces();
                                // read viewModel.info.downloadInfo.dateAdded
                                viewModelInfoDownloadInfoDateAdded = viewModelInfoDownloadInfo.dateAdded;
                                // read viewModel.info.downloadInfo.userAgent
                                viewModelInfoDownloadInfoUserAgent = viewModelInfoDownloadInfo.userAgent;
                            }


                            // read viewModel.info.downloadInfo == null ? View.GONE : View.VISIBLE
                            viewModelInfoDownloadInfoJavaLangObjectNullViewGONEViewVISIBLE = ((viewModelInfoDownloadInfoJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                            // read viewModel.info.downloadInfo == null ? View.VISIBLE : View.GONE
                            viewModelInfoDownloadInfoJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelInfoDownloadInfoJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                            // read String.valueOf(viewModel.info.downloadInfo.numPieces)
                            stringValueOfViewModelInfoDownloadInfoNumPieces = java.lang.String.valueOf(viewModelInfoDownloadInfoNumPieces);
                    }

                        if (viewModelInfoDownloadInfo != null) {
                            // read viewModel.info.downloadInfo.totalBytes
                            viewModelInfoDownloadInfoTotalBytes = viewModelInfoDownloadInfo.totalBytes;
                        }


                        // read BindingAdapterUtils.formatProgress(context, viewModel.info.downloadedBytes, viewModel.info.downloadInfo.totalBytes, @android:string/detail_downloaded_format)
                        bindingAdapterUtilsFormatProgressContextViewModelInfoDownloadedBytesViewModelInfoDownloadInfoTotalBytesDownloadedAndroidStringDetailDownloadedFormat = com.f08movies.ui.downloadmanager.core.utils.BindingAdapterUtils.formatProgress(getRoot().getContext(), viewModelInfoDownloadedBytes, viewModelInfoDownloadInfoTotalBytes, downloaded.getResources().getString(R.string.detail_downloaded_format));
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100000000000L) != 0) {

                if (viewModelInfoDownloadInfo != null) {
                    // read viewModel.info.downloadInfo.statusCode
                    viewModelInfoDownloadInfoStatusCode = viewModelInfoDownloadInfo.statusCode;
                }


                // read StatusCode.isStatusSuccess(viewModel.info.downloadInfo.statusCode)
                statusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCode = com.f08movies.ui.downloadmanager.core.model.data.StatusCode.isStatusSuccess(viewModelInfoDownloadInfoStatusCode);
        }
        if ((dirtyFlags & 0x6000cL) != 0) {

                // read viewModel.info.sha256Hash == null ? @android:string/not_available : viewModel.info.sha256Hash
                viewModelInfoSha256HashJavaLangObjectNullSha256HashAndroidStringNotAvailableViewModelInfoSha256Hash = ((viewModelInfoSha256HashJavaLangObjectNull) ? (sha256Hash.getResources().getString(R.string.not_available)) : (viewModelInfoSha256Hash));
        }
        if ((dirtyFlags & 0x4800cL) != 0) {

                // read viewModel.info.md5Hash == null ? @android:string/not_available : viewModel.info.md5Hash
                viewModelInfoMd5HashJavaLangObjectNullMd5HashAndroidStringNotAvailableViewModelInfoMd5Hash = ((viewModelInfoMd5HashJavaLangObjectNull) ? (md5Hash.getResources().getString(R.string.not_available)) : (viewModelInfoMd5Hash));
        }

        if ((dirtyFlags & 0x4040cL) != 0) {

                // read viewModel.info.downloadInfo != null ? StatusCode.isStatusSuccess(viewModel.info.downloadInfo.statusCode) : false
                viewModelInfoDownloadInfoJavaLangObjectNullStatusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCodeBooleanFalse = ((ViewModelInfoDownloadInfoJavaLangObjectNull1) ? (statusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCode) : (false));
            if((dirtyFlags & 0x4040cL) != 0) {
                if(viewModelInfoDownloadInfoJavaLangObjectNullStatusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCodeBooleanFalse) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }


                // read viewModel.info.downloadInfo != null ? StatusCode.isStatusSuccess(viewModel.info.downloadInfo.statusCode) : false ? View.VISIBLE : View.GONE
                viewModelInfoDownloadInfoJavaLangObjectNullStatusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCodeBooleanFalseViewVISIBLEViewGONE = ((viewModelInfoDownloadInfoJavaLangObjectNullStatusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCodeBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x40000L) != 0) {
            // api target 1

            this.calculateMd5Hash.setOnClickListener(mCallback1);
            this.calculateSha256Hash.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.checksum, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, checksumandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.description, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, descriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.link, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, linkandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.name, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.retry, (android.widget.CompoundButton.OnCheckedChangeListener)null, retryandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.unmeteredConnectionsOnly, (android.widget.CompoundButton.OnCheckedChangeListener)null, unmeteredConnectionsOnlyandroidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x4400cL) != 0) {
            // api target 1

            this.calculateMd5Hash.setVisibility(viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWNViewVISIBLEViewGONE);
            this.md5Hash.setVisibility(viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATEDViewVISIBLEViewGONE);
            this.md5HashProgress.setVisibility(viewModelInfoMd5StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATIONViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x5000cL) != 0) {
            // api target 1

            this.calculateSha256Hash.setVisibility(viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateUNKNOWNViewVISIBLEViewGONE);
            this.sha256Hash.setVisibility(viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATEDViewVISIBLEViewGONE);
            this.sha256HashProgress.setVisibility(viewModelInfoSha256StateComF08moviesUiDownloadmanagerUiDetailsDownloadDetailsInfoHashSumStateCALCULATIONViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4020aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checksum, viewModelMutableParamsChecksum);
        }
        if ((dirtyFlags & 0x40009L) != 0) {
            // api target 1

            this.checksumClipboardButton.setVisibility(viewModelShowClipboardButtonViewVISIBLEViewGONE);
            this.urlClipboardButton.setVisibility(viewModelShowClipboardButtonViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4040cL) != 0) {
            // api target 1

            this.content.setVisibility(viewModelInfoDownloadInfoJavaLangObjectNullViewGONEViewVISIBLE);
            com.f08movies.ui.downloadmanager.core.utils.BindingAdapterUtils.formatDate(this.dateAdded, viewModelInfoDownloadInfoDateAdded);
            this.initProgress.setVisibility(viewModelInfoDownloadInfoJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView16.setVisibility(viewModelInfoDownloadInfoJavaLangObjectNullStatusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCodeBooleanFalseViewVISIBLEViewGONE);
            this.mboundView20.setVisibility(viewModelInfoDownloadInfoJavaLangObjectNullStatusCodeIsStatusSuccessViewModelInfoDownloadInfoStatusCodeBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.numPieces, stringValueOfViewModelInfoDownloadInfoNumPieces);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userAgent, viewModelInfoDownloadInfoUserAgent);
        }
        if ((dirtyFlags & 0x4004aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, viewModelMutableParamsDescription);
        }
        if ((dirtyFlags & 0x4240cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.downloaded, bindingAdapterUtilsFormatProgressContextViewModelInfoDownloadedBytesViewModelInfoDownloadInfoTotalBytesDownloadedAndroidStringDetailDownloadedFormat);
        }
        if ((dirtyFlags & 0x4100cL) != 0) {
            // api target 1

            com.f08movies.ui.downloadmanager.core.utils.BindingAdapterUtils.formatFileSize(this.freeSpace, viewModelInfoStorageFreeSpace, freeSpace.getResources().getString(R.string.storage_free_space));
        }
        if ((dirtyFlags & 0x4001aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.link, viewModelMutableParamsUrl);
        }
        if ((dirtyFlags & 0x4800cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.md5Hash, viewModelInfoMd5HashJavaLangObjectNullMd5HashAndroidStringNotAvailableViewModelInfoMd5Hash);
        }
        if ((dirtyFlags & 0x4002aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, viewModelMutableParamsFileName);
        }
        if ((dirtyFlags & 0x4010aL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.retry, viewModelMutableParamsRetry);
        }
        if ((dirtyFlags & 0x4080cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.savePath, viewModelInfoDirName);
        }
        if ((dirtyFlags & 0x6000cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sha256Hash, viewModelInfoSha256HashJavaLangObjectNullSha256HashAndroidStringNotAvailableViewModelInfoSha256Hash);
        }
        if ((dirtyFlags & 0x4008aL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.unmeteredConnectionsOnly, viewModelMutableParamsUnmeteredConnectionsOnly);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.calcSha256Hash();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.calcMd5Hash();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showClipboardButton
        flag 1 (0x2L): viewModel.mutableParams
        flag 2 (0x3L): viewModel.info
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): viewModel.mutableParams.url
        flag 5 (0x6L): viewModel.mutableParams.fileName
        flag 6 (0x7L): viewModel.mutableParams.description
        flag 7 (0x8L): viewModel.mutableParams.unmeteredConnectionsOnly
        flag 8 (0x9L): viewModel.mutableParams.retry
        flag 9 (0xaL): viewModel.mutableParams.checksum
        flag 10 (0xbL): viewModel.info.downloadInfo
        flag 11 (0xcL): viewModel.info.dirName
        flag 12 (0xdL): viewModel.info.storageFreeSpace
        flag 13 (0xeL): viewModel.info.downloadedBytes
        flag 14 (0xfL): viewModel.info.md5State
        flag 15 (0x10L): viewModel.info.md5Hash
        flag 16 (0x11L): viewModel.info.sha256State
        flag 17 (0x12L): viewModel.info.sha256Hash
        flag 18 (0x13L): null
        flag 19 (0x14L): viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATED ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATED ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.showClipboardButton.get() ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.showClipboardButton.get() ? View.VISIBLE : View.GONE
        flag 23 (0x18L): viewModel.info.downloadInfo == null ? View.GONE : View.VISIBLE
        flag 24 (0x19L): viewModel.info.downloadInfo == null ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): viewModel.info.downloadInfo != null ? StatusCode.isStatusSuccess(viewModel.info.downloadInfo.statusCode) : false ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewModel.info.downloadInfo != null ? StatusCode.isStatusSuccess(viewModel.info.downloadInfo.statusCode) : false ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.UNKNOWN ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.UNKNOWN ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATED ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATED ? View.VISIBLE : View.GONE
        flag 31 (0x20L): viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.UNKNOWN ? View.VISIBLE : View.GONE
        flag 32 (0x21L): viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.UNKNOWN ? View.VISIBLE : View.GONE
        flag 33 (0x22L): viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATION ? View.VISIBLE : View.GONE
        flag 34 (0x23L): viewModel.info.sha256State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATION ? View.VISIBLE : View.GONE
        flag 35 (0x24L): viewModel.info.sha256Hash == null ? @android:string/not_available : viewModel.info.sha256Hash
        flag 36 (0x25L): viewModel.info.sha256Hash == null ? @android:string/not_available : viewModel.info.sha256Hash
        flag 37 (0x26L): viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATION ? View.VISIBLE : View.GONE
        flag 38 (0x27L): viewModel.info.md5State == com.f08movies.ui.downloadmanager.ui.details.DownloadDetailsInfo.HashSumState.CALCULATION ? View.VISIBLE : View.GONE
        flag 39 (0x28L): viewModel.info.md5Hash == null ? @android:string/not_available : viewModel.info.md5Hash
        flag 40 (0x29L): viewModel.info.md5Hash == null ? @android:string/not_available : viewModel.info.md5Hash
        flag 41 (0x2aL): viewModel.info.downloadInfo == null ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): viewModel.info.downloadInfo == null ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): viewModel.info.downloadInfo != null ? StatusCode.isStatusSuccess(viewModel.info.downloadInfo.statusCode) : false
        flag 44 (0x2dL): viewModel.info.downloadInfo != null ? StatusCode.isStatusSuccess(viewModel.info.downloadInfo.statusCode) : false
    flag mapping end*/
    //end
}