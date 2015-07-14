package com.example.chost.modernartui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;



/**
 * Created by chost on 7/10/2015.
 */
public class MoreInformationFragment extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        setStyle(STYLE_NO_TITLE, android.R.style.Theme_Dialog);


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setNeutralButton(R.string.more, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                DialogFragment newFragment = new optionsFragment();
                newFragment.show(getFragmentManager(), "");
            }

        });
        // Create the AlertDialog object and return it
        return builder.create();

    }

}

