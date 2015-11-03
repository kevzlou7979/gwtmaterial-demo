package nz.co.doltech.client;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.PreBootstrapper;

public class MyPreBootstrapper implements PreBootstrapper {
    @Override
    public void onPreBootstrap() {
        GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
            @Override
            public void onUncaughtException(Throwable e) {
                GWT.log("There was an uncaught exception.", e);
            }
        });
    }
}