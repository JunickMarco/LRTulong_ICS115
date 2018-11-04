package com.aquino.deguzman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class PriceCheck extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    Spinner s1,s2;
    Button b1;
    TextView t1,t2;
    String state[]=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=(Spinner)findViewById(R.id.spinner);
        s2=(Spinner)findViewById(R.id.spinner2);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);

        s1.setOnItemSelectedListener(this);

        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(this); // calling onClick() method
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==0)
        {
            state=new String[]{"EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==1)
        {
            state=new String[]{"Baclaran", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==2)
        {
            state=new String[]{"Baclaran", "EDSA", "Gil Puyat", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==3)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==4)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==5)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==6)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==7)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==8)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==9)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==10)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==11)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==12)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==13)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==14)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==15)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==16)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "R Papa", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==17)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "R Papa", "5th Ave", "Balintawak", "Roosevelt"};
        }

        if(position==18)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "R Papa", "5th Ave", "Monumento", "Roosevelt"};
        }

        if(position==19)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "R Papa", "5th Ave", "Monumento", "Balintawak"};
        }


        ArrayAdapter<String> adt=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, state);
        s2.setAdapter(adt);

        t2.setText("Click any button below to check price");
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        String country=s1.getSelectedItem().toString();
        String state=s2.getSelectedItem().toString();


        switch (v.getId()) {

            case R.id.button:
                switch (country) {
                    case "Baclaran":
                        switch (state) {
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "EDSA":
                        switch (state) {
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Libertad":
                        switch (state) {
                            case "Baclaran":
                            case "EDSA":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Gil Puyat":
                        switch (state) {
                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Vito Cruz":
                        switch (state) {
                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "5th Avenue":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Quirino":
                        switch (state) {
                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Pedro Gil":
                        switch (state) {
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "UN Ave":
                        switch (state) {
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Central":
                        switch (state) {
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Carriedo":
                        switch (state) {
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "5th Avenue":
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Doroteo Jose":
                        switch (state) {
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Bambang":
                        switch (state) {
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Tayuman":
                        switch (state) {
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Blumentritt":
                        switch (state) {
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Abad Santos":
                        switch (state) {
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "R Papa":
                        switch (state) {
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "5th Avenue":
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "5th Avenue":
                        switch (state) {
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Monumento":
                        switch (state) {
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Balintawak":
                        switch (state) {
                            case "R Papa":
                            case "5th Avenue":
                            case "Monumento":
                            case "Roosevelt":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Roosevelt":
                        switch (state) {
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R Papa":
                            case "5th Avenue":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }


                }
                break;

            case R.id.button2:
                switch (country) {
                    case "Baclaran":
                        switch (state) {
                            case "EDSA":
                            case "Libertad":
                                t1.setText("30");
                                t2.setText("Stored Value Ticket Price");
                        }
                }
                break;

            default:

                break;
        }
    }
}
