package com.example.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<teacher> t = teacher.get3randomteacher();
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        teacheradapter ta=new teacheradapter();
        lv.setAdapter(ta);
    }

    class teacheradapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return t.size();
        }

        @Override
        public teacher getItem(int position) {
            return t.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View itv = getLayoutInflater().inflate(R.layout.lis,parent,false);
            TextView n= itv.findViewById(R.id.n);
            TextView c= itv.findViewById(R.id.c);
            n.setText(getItem(position).getName());
            c.setText(getItem(position).getCourse());
            return itv;
        }

    }
}
