package sg.edu.rp.c346.id21028514.testinkilag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mod1;
    ImageView mod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mod1 = findViewById(R.id.imageModule1Border);
        mod2 = findViewById(R.id.imageModule2Border);

        mod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Module_Page_1.class);
                intent.putExtra("Module_code1", "C346");
                intent.putExtra("Module_name1", "Android Programming");
                intent.putExtra("Semester_Year1", "2020");
                intent.putExtra("Semester1", "1");
                intent.putExtra("Module_Credit1", "4");
                intent.putExtra("Venue1", "W66M");
                startActivity(intent);
            }
        });
        mod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Module_Page_1.class);
                intent.putExtra("Module_code2", "C349");
                intent.putExtra("Module_name2", "iPad Programming");
                intent.putExtra("Semester_Year2", "2020");
                intent.putExtra("Semester2", "1");
                intent.putExtra("Module_Credit2", "4");
                intent.putExtra("Venue2", "W66E");
                startActivity(intent);
            }
        });
    }
}