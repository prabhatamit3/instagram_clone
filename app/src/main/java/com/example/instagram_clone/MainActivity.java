package com.example.instagram_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class MainActivity extends AppCompatActivity {
    EditText txt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.editText);
        img=findViewById(R.id.imageView);

    }
    public void tapped(View tap){
        ParseObject name = new ParseObject("Information");
        name.put("name",txt.getText().toString());
        
        name.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null){
                    Toast.makeText(MainActivity.this,"dd "+txt.getText().toString(),Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
