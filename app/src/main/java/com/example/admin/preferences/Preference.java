package com.example.admin.preferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Admin on 26-09-2016.
 */
public class Preference extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
