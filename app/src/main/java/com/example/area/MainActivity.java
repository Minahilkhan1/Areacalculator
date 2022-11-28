package com.example.area;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView,width_field,Height_Field,Radius_Field,textView_Result;
    EditText editTextNumberDecimal,editTextNumberDecimal2,editTextNumberDecimal3;
    Spinner spinner;


    Double widthy=0.0;
    Double heighty=0.0;
    Double radiousy=0.0;

    Double result=0.0;
    private Object Spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        width_field=(TextView) findViewById(R.id.width_field);
        Height_Field=(TextView) findViewById(R.id.Height_Field);
        Radius_Field=(TextView) findViewById(R.id.Radius_Field);
        Spinner=(Spinner) findViewById(R.id.spinner);
        textView_Result=(TextView) findViewById(R.id.textView_Result);


        List<String> shapes=new ArrayList<String>();
        shapes.add("select the shape ");
        shapes.add("circle");
        shapes.add("rectangle");
        shapes.add("square");
        shapes.add("sphere");
        shapes.add("cube");


        ArrayAdapter<String>  dataAdapter= new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,shapes);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);



        spinner.setAdapter(dataAdapter);




        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                int i = 0;
                String selectedItem = dataAdapter.getItem(i).toString();


                heighty= Double.parseDouble(Height_Field.getText().toString());
                widthy= Double.parseDouble(width_field.getText().toString());
                radiousy= Double.parseDouble(Radius_Field.getText().toString());




                if(selectedItem.equals("Select the shape!"))
                {
                    Toast.makeText(MainActivity.this,"select any shape",Toast.LENGTH_SHORT).show();
                }

                else if(selectedItem.equals("circle")){
                    result =3.14*radiousy*radiousy;


                    textView_Result.setText("The Area :+result");
                }


                else if(selectedItem.equals("square")){


                    result=heighty*widthy;

                    textView_Result.setText("The Area :+result");
                }


                else if(selectedItem.equals("rectangle")){


                    result=heighty*widthy;

                    textView_Result.setText("The Area :+result");
                }


                else if(selectedItem.equals("sphere")){


                    result=(4/3) *3.14 *radiousy*radiousy*radiousy;

                    textView_Result.setText("The Area :+result");
                }



                else
                    selectedItem.equals("cube");

                {
                    result=widthy*heighty*widthy;

                    textView_Result.setText("The Area :+result");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });











    }
}
