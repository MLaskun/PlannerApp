package com.example.plannerapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class Main extends Activity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText name, lastname, subject;
    private Button popupCancel, popupSave;

//https://www.youtube.com/watch?v=4GYKOzgQDWI
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void newMondayView(View view) {
        createNewMondayDialog();
    }


    public void createNewMondayDialog(){
        dialogBuilder = new AlertDialog.Builder(this);
        final View mondayPopupView = getLayoutInflater().inflate(R.layout.popup, null);

        popupCancel = (Button) mondayPopupView.findViewById(R.id.cancelButton);

        dialogBuilder.setView(mondayPopupView);
        dialog = dialogBuilder.create();
        dialog.show();

        popupCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }
}
