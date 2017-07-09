package com.cfg.reachinghands;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

/**
 * Created by Varsha on 09-07-2017.
 */

public class RegistrationIntentService extends IntentService {
    public RegistrationIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        InstanceID instanceID = InstanceID.getInstance(this);
        //String token = instanceID.getToken(getString(R.string.gcm_defaultSenderId),
          //      GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
    }
}
