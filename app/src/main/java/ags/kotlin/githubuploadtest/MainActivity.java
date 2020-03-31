package ags.kotlin.githubuploadtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText main_edt_name;
    Button main_btn_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_edt_name=findViewById(R.id. main_edt_name);
        main_btn_value=findViewById(R.id.main_btn_value);

        main_btn_value.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+main_edt_name.getText().toString().trim(), Toast.LENGTH_SHORT).show();
                int i=10;
                int j=20;
            }
        });
    }
}
