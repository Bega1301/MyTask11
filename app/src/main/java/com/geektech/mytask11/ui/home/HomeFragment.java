package com.geektech.mytask11.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.mytask11.R;
import com.geektech.mytask11.models.Task;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private TaskAdapter adapter;
    private ArrayList<Task> list;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView= view.findViewById(R.id.recyclerView);
        list =new ArrayList<>();
        list.add(new Task("Altynbek", ""));
        list.add(new Task("Ruslan", ""));
        list.add(new Task("Tumar", ""));
        list.add(new Task("Daniyar", ""));
        adapter= new TaskAdapter(list);
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);

    }
}