package com.rudra.IMEPayments;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.swifttechnology.imepaysdk.IMEPayment;
import com.swifttechnology.imepaysdk.IMEPaymentCallback;
import com.swifttechnology.imepaysdk.ENVIRONMENT;
import android.app.Activity;

@DesignerComponent(
        version = 1,
        description = "",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "imepay.jar")
//Permissions
@UsesPermissions(permissionNames = "")

public class IMEPayments extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public IMEPayments(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction(description = "Sample Function Generated by Niotron")
    public void TestFunction(String MerchantCode, String MerchantName, String TransactionRecordingUrl, String Amount, String ReferenceId, String Module, String Username, String Password){
    IMEPayment imePayment = new IMEPayment(this.context, ENVIRONMENT.LIVE);

imePayment.performPayment(MerchantCode, MerchantName, TransactionRecordingUrl, Amount, ReferenceId, Module, Username, Password,
                          new IMEPaymentCallback() {
           @Override
           public void onSuccess(int responseCode, String responseDescription, String transactionId, String msisdn, String amount, String refId) {
               //code here
           }
});
    }

}

