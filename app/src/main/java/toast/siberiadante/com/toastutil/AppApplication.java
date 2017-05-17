package toast.siberiadante.com.toastutil;

import android.app.Application;

import com.siberiadante.toastutils.ToastApp;

/**
 * Created by SiberiaDante on 2017/5/17.
 */

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化ToastUtils
        ToastApp.initToastUtils(getApplicationContext());
    }
}
