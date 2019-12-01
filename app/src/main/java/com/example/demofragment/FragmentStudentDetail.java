package com.example.demofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FragmentStudentDetail extends Fragment {

    View view;
    TextView txtAddress, txtAge;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_detail, container, false);

        setVar();

        return view;
    }

    public void setData(Student student) {
        txtAge.setText(student.getAge() + "");
        txtAddress.setText(student.getAddress());
    }

    private void setVar() {
        txtAddress = view.findViewById(R.id.txtAddress);
        txtAge = view.findViewById(R.id.txtAge);
    }
}
