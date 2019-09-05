package com.example.lenovo.bkash;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.bkash.pojo.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView tv1, tv2, fullNameTV;
    private EditText nameET, phoneET, cityET, emailET;
    private List<Person> persons;
    private Button button1;

    int clickcount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        fullNameTV = findViewById(R.id.fullNameTV);
        nameET = findViewById(R.id.nameInput);
        phoneET = findViewById(R.id.phoneInput);
        cityET = findViewById(R.id.cityInput);
        emailET = findViewById(R.id.emailInput);
        persons = new ArrayList<>();
        button1=findViewById(R.id.button);
        //tv1.setText(getResources().getString(R.string.app_name));
        //tv2.setText("Mobile App Develop Batch 47");

  /* StringBuilder builder = new StringBuilder();
        builder.append("Basis").append(" ").append("BITM");
        Toast.makeText(this, builder.toString(), Toast.LENGTH_LONG).show();*/
    }

    public void changeText(View view) {
        Toast.makeText(this, "Save Successful", Toast.LENGTH_SHORT).show();
        String name = nameET.getText().toString();
        String phone = phoneET.getText().toString();
        String city = cityET.getText().toString();
        String email = emailET.getText().toString();

        if(name.isEmpty()){
            nameET.setError("Please provide first name");
        }else if(phone.isEmpty()){
            phoneET.setError("please provide last name");
        }else if(city.isEmpty()){
            cityET.setError("please provide last name");
        }else if(email.isEmpty()){
            emailET.setError("please provide last name");
        }else{

            Person person = new Person(name, phone, city, email);
            persons.add(person);

            StringBuilder builder = new StringBuilder();
            for(Person p : persons){
                builder.append(p.toString()).append("\n");
            }
            fullNameTV.setText(builder.toString());
            nameET.setText("");
            phoneET.setText("");
            cityET.setText("");
            emailET.setText("");

        }

        clickcount++;
        button1.setText(Integer.toString(clickcount));
    }

    public void changeColor(View view) {
        tv1.setTextColor(Color.BLUE);
    }
}
