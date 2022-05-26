package sg.edu.rp.c346.id21028514.testinkilag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Module_Page_1 extends AppCompatActivity {
    TextView endDisplay;
    TextView headerDisplay;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_page1);

        endDisplay = findViewById(R.id.textDisplay);
        headerDisplay = findViewById(R.id.textHeaderResult);
        back = findViewById(R.id.buttonBack);

    Intent intentReceived = getIntent();
    if (intentReceived.hasExtra("Module_code1")) {
        String mod = intentReceived.getStringExtra("Module_code1");
        String name = intentReceived.getStringExtra("Module_name1");
        String year = intentReceived.getStringExtra("Semester_Year1");
        String sem = intentReceived.getStringExtra("Semester1");
        String modCred = intentReceived.getStringExtra("Module_Credit1");
        String venue = intentReceived.getStringExtra("Venue1");
        String display = String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s",mod,name,year,sem,modCred,venue);
        headerDisplay.setText(mod);
        endDisplay.setText(display);

    }else if (intentReceived.hasExtra("Module_code2")) {
        String mod = intentReceived.getStringExtra("Module_code2");
        String name = intentReceived.getStringExtra("Module_name2");
        String year = intentReceived.getStringExtra("Semester_Year2");
        String sem = intentReceived.getStringExtra("Semester2");
        String modCred = intentReceived.getStringExtra("Module_Credit2");
        String venue = intentReceived.getStringExtra("Venue2");
        String display = String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s", mod, name, year, sem, modCred, venue);
        headerDisplay.setText(mod);
        endDisplay.setText(display);
    }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Module_Page_1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}