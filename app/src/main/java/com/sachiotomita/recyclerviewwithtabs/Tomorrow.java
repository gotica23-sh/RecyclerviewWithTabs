package com.sachiotomita.recyclerviewwithtabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sat on 1/20/20.
 */
public class Tomorrow extends Fragment {


    RecyclerView student_rview;
    List<Student> list_student;
    RVAdapter rvAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_tomorrow, container, false);
        loadStudent();
        student_rview = (RecyclerView) view.findViewById(R.id.recyclerview);

        rvAdapter = new RVAdapter(getActivity(), list_student);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        student_rview.setLayoutManager(layoutManager);
        student_rview.setAdapter(rvAdapter);

        return view;
    }

    void loadStudent() {
        list_student = new ArrayList<>();
        list_student.add(new Student("Anil", "Tadipatri"));
        list_student.add(new Student("Bhaskar", "Tadipatri"));
        list_student.add(new Student("Manohar", "Tadipatri"));
        list_student.add(new Student("Gopal", "Tadipatri"));
        list_student.add(new Student("Krishna", "Tadipatri"));
        list_student.add(new Student("JayaRam", "Tadipatri"));
        list_student.add(new Student("Kadiri", "Tadipatri"));
        list_student.add(new Student("Anil", "Tadipatri"));
        list_student.add(new Student("Bhaskar", "Tadipatri"));
        list_student.add(new Student("Manohar", "Tadipatri"));
        list_student.add(new Student("Gopal", "Tadipatri"));
        list_student.add(new Student("Krishna", "Tadipatri"));
        list_student.add(new Student("JayaRam", "Tadipatri"));
        list_student.add(new Student("Kadiri", "Tadipatri"));
//        rvAdapter.notifyDataSetChanged();

    }
}
