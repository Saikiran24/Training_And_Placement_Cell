package com.saikiran.myproject.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.saikiran.myproject.Adapters.ViewHolders.StudentsViewHolder;
import com.saikiran.myproject.Data.Student;
import com.saikiran.myproject.R;

import java.util.ArrayList;
import java.util.List;



public class AllStudentsAdapter extends RecyclerView.Adapter<StudentsViewHolder> {
    private List<Student> list = new ArrayList<>();

    @Override
    public StudentsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student_list_view, parent, false);
        return new StudentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentsViewHolder holder, int position) {
        holder.bindData(getItemByPosition(position));
    }

    public Student getItemByPosition(int position) {
        return list.get(position);
    }

    public void setList(List<Student> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

