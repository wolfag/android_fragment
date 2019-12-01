package com.example.demofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class StudentDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

        Configuration configuration = getResources().getConfiguration();
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
        } else {
            setData();
        }

    }

    private void setData() {
        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra(MainActivity.STUDENT_TRANSFER_KEY);

        FragmentStudentDetail detail = (FragmentStudentDetail) getFragmentManager().findFragmentById(R.id.fmStudentDetailAct);
        detail.setData(student);

    }
}
