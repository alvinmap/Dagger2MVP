package com.zhxu.dagger2mvp.dragger.module;


import com.zhxu.dagger2mvp.view.ILoginView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xz on 2016/7/13.
 */

@Module
public class MainModule {

    private final ILoginView view ;

    public MainModule(ILoginView view){
        this.view = view ;

        
    }

    @Provides
    ILoginView provideILogView(){
        return view ;
    }

}
