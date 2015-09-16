package com.amitsinha.backashome;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;

public class IonicHome extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("minimize".equals(action)) {
            try {               
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                this.cordova.getActivity().startActivity(intent);
                callbackContext.success();
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;  
    }
}