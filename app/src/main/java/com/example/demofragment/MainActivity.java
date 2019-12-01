package com.example.demofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements StudentContainer {

    public static final String STUDENT_TRANSFER_KEY = "STUDENT_TRANSFER_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void StudentData(Student student) {
        FragmentStudentDetail detail = (FragmentStudentDetail) getFragmentManager().findFragmentById(R.id.fmStudenDetail);

        Configuration configuration = getResources().getConfiguration();

        if (detail != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//        if (detail != null && detail.isInLayout()) {
            detail.setData(student);
        } else {
            Intent intent = new Intent(getApplicationContext(), StudentDetailActivity.class);
            intent.putExtra(STUDENT_TRANSFER_KEY, student);
            startActivity(intent);
        }


    }
}
