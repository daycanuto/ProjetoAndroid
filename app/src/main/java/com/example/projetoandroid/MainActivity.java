package com.example.projetoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView.findViewById(R.id.recyclerView);

        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo("Titulo");
        tarefa.setDescricao("Descrição");
        tarefa.setUsuario(new Usuario(1,"dayane"));

        Tarefa tarefa2 = new Tarefa();
        tarefa2.setTitulo("Titulo 2");
        tarefa2.setDescricao("Descrição 2");
        tarefa2.setUsuario(new Usuario(2,"marcos"));

        ArrayList<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(tarefa);
        tarefas.add(tarefa2);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new RecyclerAdapter(tarefas);
        recyclerView.setAdapter(mAdapter);
    }
}
