package com.example.demofragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentStudentList extends ListFragment {

    ArrayList<Student> studentArrayList;
    StudentAdapter studentAdapter;
    StudentContainer studentContainer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        studentContainer = (StudentContainer) getActivity();
        studentArrayList = new ArrayList<>();
        studentAdapter = new StudentAdapter(getActivity(), R.layout.row_studen, studentArrayList);

        setListAdapter(studentAdapter);

        addStudents(20);

        return inflater.inflate(R.layout.fragment_student_list, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getActivity(), studentArrayList.get(position).getName(), Toast.LENGTH_SHORT).show();
        studentContainer.StudentData(studentArrayList.get(position));
    }

    private void addStudents(int count) {
        for (int i = 0; i < count; i++) {
            studentArrayList.add(new Student("name " + i, "address " + i, i));
        }
    }
}
