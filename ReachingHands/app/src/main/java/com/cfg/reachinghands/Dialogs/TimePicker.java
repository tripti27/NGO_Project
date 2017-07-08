package com.appcraftz.medicallpharma.Dialogs;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by appcraftz on 03/05/17.
 */

public class TimePicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    EditText view;

    public TimePicker(EditText view)
    {
        this.view = view;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute =calendar.get(Calendar.MINUTE);


        return new TimePickerDialog(getActivity(),this,hour,minute,true);
    }

    @Override
    public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
        String time = String.valueOf(hourOfDay)+":"+ String.valueOf(minute)+":"+"00";
        this.view.setText(time);
    }
}
