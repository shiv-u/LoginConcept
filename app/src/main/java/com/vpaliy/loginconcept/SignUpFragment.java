package com.vpaliy.loginconcept;

import android.os.Build;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.transition.TransitionManager;
import android.view.View;
import android.support.annotation.Nullable;
import android.annotation.TargetApi;


public class SignUpFragment extends AuthFragment{

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if(view!=null){
            view.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.blue_300));
            caption.setText(getString(R.string.sign_up_label));
            foldStuff();
        }
    }

    @Override
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void fold() {
        TransitionManager.beginDelayedTransition(parent);
        foldStuff();
    }

    private void foldStuff(){
        caption.setVerticalText(true);
        caption.setScaleY(0.5f);
        caption.setScaleX(0.5f);
        ConstraintLayout.LayoutParams params=getParams();
        params.rightToRight=ConstraintLayout.LayoutParams.UNSET;
        params.verticalBias=0.5f;
        caption.setLayoutParams(params);
    }
}
