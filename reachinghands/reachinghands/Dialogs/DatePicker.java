package com.appcraftz.medicallpharma.Dialogs;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by appcraftz on 03/05/17.
 */

public class DatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    EditText view;

    public DatePicker(EditText view)
    {
        this.view = view;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        Calendar calendar = Calendar.getInstance();

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = 1+calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);


        return new DatePickerDialog(getActivity(),this,year,month,day);
    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {

        String date = String.valueOf(dayOfMonth)+"-"+String.valueOf(month+1)+"-"+String.valueOf(year);
        this.view.setText(date);
    }
}
