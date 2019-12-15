package com.example.application;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class HealthyActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Makan secara sehat dan seimbang",
            "Makan dan minum sealami mungkin",
            "Kurangi konsumsi garam",
            "Konsumsi asupan fermentasi untuk kesehatan usus dan pencernaan",
            "Berhenti melakukan kebiasaan buruk yang membahayakan kesehatan",
            "Olahraga secara teratur","Cukupi kebutuhan cairan","Berjemur untuk mendapatkan asupan vitamin D yang cukup",
            "Hindari stres","Istirahat cukup"};
    String mDescription[] = {"Tips1","Tips2","Tips3","Tips4","Tips5","Tips6","Tips7","Tips8","Tips9","Tips10"};
    int images[] = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,
            R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy);

        listView = findViewById(R.id.listView);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(HealthyActivity.this,"Tips1" , Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(HealthyActivity.this,"Tips2" , Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(HealthyActivity.this, "Tips3", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(HealthyActivity.this,"Tips4" , Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(HealthyActivity.this,"Tips5" , Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(HealthyActivity.this,"Tips6" , Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(HealthyActivity.this,"Tips7" , Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(HealthyActivity.this,"Tips8" , Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(HealthyActivity.this,"Tips9" , Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(HealthyActivity.this,"Tips10" , Toast.LENGTH_SHORT).show();
                }
            }
        });
        // so item click is done now check list view
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return row;
        }
    }
}
