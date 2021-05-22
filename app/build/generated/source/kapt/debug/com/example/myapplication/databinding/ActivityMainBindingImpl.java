package com.example.myapplication.databinding;
import com.example.myapplication.R;
import com.example.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 9);
        sViewsWithIds.put(R.id.textView5, 10);
        sViewsWithIds.put(R.id.textView7, 11);
        sViewsWithIds.put(R.id.textView9, 12);
        sViewsWithIds.put(R.id.imageView, 13);
        sViewsWithIds.put(R.id.imageView2, 14);
        sViewsWithIds.put(R.id.imageView3, 15);
        sViewsWithIds.put(R.id.imageView4, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[12]
            , (android.view.View) bindings[9]
            );
        this.imageView5.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        this.textView10.setTag(null);
        this.textView2.setTag(null);
        this.textView3.setTag(null);
        this.textView4.setTag(null);
        this.textView6.setTag(null);
        this.textView8.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        if (BR.vm == variableId) {
            setVm((com.example.myapplication.DataViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.example.myapplication.DataViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmHum((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmIsDay((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmKota((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeVmDataModel((androidx.lifecycle.MutableLiveData<com.example.myapplication.DataModel>) object, fieldId);
            case 5 :
                return onChangeVmTime((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeVmTemp((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeVmGreetings((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmHum(androidx.lifecycle.MutableLiveData<java.lang.String> VmHum, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsDay(androidx.lifecycle.MutableLiveData<java.lang.Boolean> VmIsDay, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDate(androidx.lifecycle.MutableLiveData<java.lang.String> VmDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmKota(androidx.lifecycle.MutableLiveData<java.lang.String> VmKota, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDataModel(androidx.lifecycle.MutableLiveData<com.example.myapplication.DataModel> VmDataModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTime(androidx.lifecycle.MutableLiveData<java.lang.String> VmTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTemp(androidx.lifecycle.MutableLiveData<java.lang.String> VmTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmGreetings(androidx.lifecycle.MutableLiveData<java.lang.String> VmGreetings, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        java.lang.String vmHumGetValue = null;
        java.lang.String vmGreetingsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmHum = null;
        java.lang.String vmTempGetValue = null;
        java.lang.String javaLangStringHumidityNNVmGreetingsJavaLangStringNFaiz = null;
        java.lang.String vmKotaGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> vmIsDay = null;
        java.lang.Boolean vmIsDayGetValue = null;
        com.example.myapplication.DataViewModel vm = mVm;
        com.example.myapplication.DataModel vmDataModelGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmDate = null;
        java.lang.String vmDateGetValue = null;
        java.lang.Double vmDataModelWindSpeed = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmKota = null;
        java.lang.String vmDataModelWindSpeedToStringJavaLangStringMS = null;
        androidx.lifecycle.MutableLiveData<com.example.myapplication.DataModel> vmDataModel = null;
        java.lang.String vmTimeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmTime = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmTemp = null;
        java.lang.String javaLangStringHumidityNNVmGreetings = null;
        android.graphics.drawable.Drawable vmIsDayImageView5AndroidDrawableIcBaselineWbSunny24ImageView5AndroidDrawableIcBaselineBrightness324 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsDayGetValue = false;
        com.example.myapplication.Wind vmDataModelWind = null;
        java.lang.String vmDataModelWindSpeedToString = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmGreetings = null;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (vm != null) {
                        // read vm.hum
                        vmHum = vm.getHum();
                    }
                    updateLiveDataRegistration(0, vmHum);


                    if (vmHum != null) {
                        // read vm.hum.getValue()
                        vmHumGetValue = vmHum.getValue();
                    }
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (vm != null) {
                        // read vm.isDay
                        vmIsDay = vm.isDay();
                    }
                    updateLiveDataRegistration(1, vmIsDay);


                    if (vmIsDay != null) {
                        // read vm.isDay.getValue()
                        vmIsDayGetValue = vmIsDay.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isDay.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsDayGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmIsDayGetValue);
                if((dirtyFlags & 0x302L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsDayGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isDay.getValue()) ? @android:drawable/ic_baseline_wb_sunny_24 : @android:drawable/ic_baseline_brightness_3_24
                    vmIsDayImageView5AndroidDrawableIcBaselineWbSunny24ImageView5AndroidDrawableIcBaselineBrightness324 = ((androidxDatabindingViewDataBindingSafeUnboxVmIsDayGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imageView5.getContext(), R.drawable.ic_baseline_wb_sunny_24)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imageView5.getContext(), R.drawable.ic_baseline_brightness_3_24)));
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (vm != null) {
                        // read vm.date
                        vmDate = vm.getDate();
                    }
                    updateLiveDataRegistration(2, vmDate);


                    if (vmDate != null) {
                        // read vm.date.getValue()
                        vmDateGetValue = vmDate.getValue();
                    }
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (vm != null) {
                        // read vm.kota
                        vmKota = vm.getKota();
                    }
                    updateLiveDataRegistration(3, vmKota);


                    if (vmKota != null) {
                        // read vm.kota.getValue()
                        vmKotaGetValue = vmKota.getValue();
                    }
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (vm != null) {
                        // read vm.dataModel
                        vmDataModel = vm.getDataModel();
                    }
                    updateLiveDataRegistration(4, vmDataModel);


                    if (vmDataModel != null) {
                        // read vm.dataModel.getValue()
                        vmDataModelGetValue = vmDataModel.getValue();
                    }


                    if (vmDataModelGetValue != null) {
                        // read vm.dataModel.getValue().wind
                        vmDataModelWind = vmDataModelGetValue.getWind();
                    }


                    if (vmDataModelWind != null) {
                        // read vm.dataModel.getValue().wind.speed
                        vmDataModelWindSpeed = vmDataModelWind.getSpeed();
                    }


                    if (vmDataModelWindSpeed != null) {
                        // read vm.dataModel.getValue().wind.speed.toString()
                        vmDataModelWindSpeedToString = vmDataModelWindSpeed.toString();
                    }


                    // read (vm.dataModel.getValue().wind.speed.toString()) + ("m/s")
                    vmDataModelWindSpeedToStringJavaLangStringMS = (vmDataModelWindSpeedToString) + ("m/s");
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (vm != null) {
                        // read vm.time
                        vmTime = vm.getTime();
                    }
                    updateLiveDataRegistration(5, vmTime);


                    if (vmTime != null) {
                        // read vm.time.getValue()
                        vmTimeGetValue = vmTime.getValue();
                    }
            }
            if ((dirtyFlags & 0x340L) != 0) {

                    if (vm != null) {
                        // read vm.temp
                        vmTemp = vm.getTemp();
                    }
                    updateLiveDataRegistration(6, vmTemp);


                    if (vmTemp != null) {
                        // read vm.temp.getValue()
                        vmTempGetValue = vmTemp.getValue();
                    }
            }
            if ((dirtyFlags & 0x380L) != 0) {

                    if (vm != null) {
                        // read vm.greetings
                        vmGreetings = vm.getGreetings();
                    }
                    updateLiveDataRegistration(7, vmGreetings);


                    if (vmGreetings != null) {
                        // read vm.greetings.getValue()
                        vmGreetingsGetValue = vmGreetings.getValue();
                    }


                    // read ("humidity\n\n") + (vm.greetings.getValue())
                    javaLangStringHumidityNNVmGreetings = ("humidity\n\n") + (vmGreetingsGetValue);


                    // read (("humidity\n\n") + (vm.greetings.getValue())) + ("\nFaiz")
                    javaLangStringHumidityNNVmGreetingsJavaLangStringNFaiz = (javaLangStringHumidityNNVmGreetings) + ("\nFaiz");
            }
        }
        // batch finished
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imageView5, vmIsDayImageView5AndroidDrawableIcBaselineWbSunny24ImageView5AndroidDrawableIcBaselineBrightness324);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, vmKotaGetValue);
        }
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView10, vmTempGetValue);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, vmDateGetValue);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, vmHumGetValue);
        }
        if ((dirtyFlags & 0x380L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView4, javaLangStringHumidityNNVmGreetingsJavaLangStringNFaiz);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView6, vmTimeGetValue);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, vmDataModelWindSpeedToStringJavaLangStringMS);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.hum
        flag 1 (0x2L): vm.isDay
        flag 2 (0x3L): vm.date
        flag 3 (0x4L): vm.kota
        flag 4 (0x5L): vm.dataModel
        flag 5 (0x6L): vm.time
        flag 6 (0x7L): vm.temp
        flag 7 (0x8L): vm.greetings
        flag 8 (0x9L): vm
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isDay.getValue()) ? @android:drawable/ic_baseline_wb_sunny_24 : @android:drawable/ic_baseline_brightness_3_24
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isDay.getValue()) ? @android:drawable/ic_baseline_wb_sunny_24 : @android:drawable/ic_baseline_brightness_3_24
    flag mapping end*/
    //end
}