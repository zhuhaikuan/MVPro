package org.loader.mvprotest2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import org.loader.view.ViewImpl;

/**
 * Created by qibin on 2015/11/16.
 */
public class MainView extends ViewImpl {

    public void showFragment(FragmentManager fm) {
        fm.beginTransaction().add(R.id.container, new MyFragment(), "my").commit();
    }

    public void restoreFragment(FragmentManager fm) {
        Fragment fragment = fm.findFragmentByTag("my");
        if(fragment == null) {
            showFragment(fm);
        }else {
            fm.beginTransaction().show(fragment).commit();
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
}
