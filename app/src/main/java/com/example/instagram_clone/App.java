package com.example.instagram_clone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ujQhCajNj6vuIia9dtQxCRhRBAmlQeUpSqpkpzoB")
                // if defined
                .clientKey("SrPGnDsuVfztPtp9y9oDTlTnLdIC484nYJuLZ3pD")
                .server("https://parseapi.back4app.com/")
                .build()
        );


    }
}
