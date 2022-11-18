package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Turist Guide v 1.1");
//------------------------------------------------
        //new object
        //ImportCity CitySights = new ImportCity();

        //CitySights.setName("Serres");
        //CitySights.setPlace1("Acropoli");
        //CitySights.setPlace2("Koilada");
        //CitySights.setPlace3("Dioikhthrio");
//------------------------------------------------

        //new object
        ImportCity CitySights = new ImportCity();
        //Data from Back-End
        //paths from Images
        String url1 = "https://www.kastra.eu/pics/serres12.jpg";
        String url2 = "https://foititisonline.gr/wp-content/uploads/2018/03/koilada-serrwn2.jpg";
        String url3 = "https://www.ertnews.gr/wp-content/uploads/2020/11/dioikhthrio-e-vima.jpg";

        //Descriptions from places
        String dscr1 ="JAVA IS A TECHNOLOGY OF CHOICE FOR BUILDING APPLICATIONS" +
                " USING MANAGED CODES THAT CAN EXECUTE ON MOBILE DEVICES.\n" +
                "\n" +
                "Android is an open source software platform and Linux-based" +
                " operating system for mobile devices. The Android platform " +
                "allows developers to write managed code using Java to manage " +
                "and control the Android device. Android applications can be" +
                " developed by using the Java programming language and the " +
                "Android SDK. So, familiarity with the basics of the Java " +
                "programming language is a prerequisite for programming on" +
                " the Android platform. This article discusses where Java fits" +
                " in mobile application development and how we can use Java and" +
                " Android SDK to write applications that can work on Android devices.\n" +
                "\n" +
                "THE CHOICE OF JAVA\n" +
                "\n "+
                "What made Java be the technology of choice for mobile development for the" +
                " Android platform? The Java Programming Language emerged in the mid-1990s;" +
                " it was created by James Gosling of Sun Microsystems. Incidentally," +
                " Sun Microsystems was since bought by Oracle." +
                " Java has been widely popular the world over, " +
                "primarily because of a vast array of features it provides. " +
                "Java’s promise of “Write once and run anywhere” was one of the major" +
                " factors for the success of Java over the past few decades.\n" +
                "\n" +
                "Java even made inroads into embedded processors technology as well;" +
                " the Java Mobile Edition was built for creating applications " +
                "that can run on mobile devices. All these, added to Java’s meteoric rise," +
                " were the prime factors that attributed to the decision of adopting " +
                "Java as the primary development language for building " +
                "applications that run on Android. Java programs are secure because" +
                " they run within a sandbox environment. Programs written in Java are compiled " +
                "into intermediate code known as bytecode. This bytecode is then executed inside" +
                " the context of the Java Virtual Machine. You can learn more about Java from" +
                " this link.\n" +
                "\n" +
                "USING JAVA FOR BUILDING MOBILE APPLICATIONS\n" +
                "\n" +
                "The mobile edition of Java is called Java ME. Java ME is based on Java " +
                "SE and is supported by most smartphones and tablets. The Java Platform" +
                " Micro Edition (Java ME) provides a flexible, secure environment for" +
                " building and executing applications that are targeted at embedded and " +
                "mobile devices. The applications that are built using Java ME are portable," +
                " secure, and can take advantage of the native capabilities of the device. " +
                "Java ME addresses the constraints that are involved in building applications " +
                "that are targeted at mobile devices. In essence, Java ME addresses the " +
                "challenge of executing applications on devices " +
                "that are low on available memory, display, and power.\n" +
                "\n" +
                "There are various ways to build applications for Android devices," +
                " but the recommended approach is to leverage the" +
                " Java programming language and the Android SDK." +
                " You can explore more about the Android SDK Manager from here.";
        String dscr2 ="Koilada Agiwn Anargyrwn "+"Serrwn";
        String dscr3 ="Dioikitirio PE Serrwn PKM";

        //put values in the object
        CitySights.setNameCity("Serres");
        CitySights.setPlace1("Acropoli",url1,dscr1);
        CitySights.setPlace2("Koilada",url2,dscr2);
        CitySights.setPlace3("Dioikitirio",url3,dscr3);


        TextView txtViewCity = findViewById(R.id.text_view_City);
        TextView txtViewPlace1 = findViewById(R.id.text_View_Place1);
        TextView txtViewPlace2 = findViewById(R.id.text_View_Place2);
        TextView txtViewPlace3 = findViewById(R.id.text_View_Place3);

        Button buttonFind = findViewById(R.id.Findbutton);
        EditText edittext1 = findViewById(R.id.editTextCity);

        buttonFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //takes the city name to search
                String CityName=edittext1.getText().toString();
                CitySights.setNameCity(CityName );

                txtViewCity.setText(CitySights.getNameCity());
                txtViewPlace1.setText(CitySights.getPlace1().getNameP());
                txtViewPlace2.setText(CitySights.getPlace2().getNameP());
                txtViewPlace3.setText(CitySights.getPlace3().getNameP());
            }
        });

         //open a new form - activity
        Intent i = new Intent(MainActivity.this,Information.class);

        Button place1InfoBtn = findViewById(R.id.btnPlace1);
        Button place2InfoBtn = findViewById(R.id.btnPlace2);
        Button place3InfoBtn = findViewById(R.id.btnPlace3);

        //---------------------------------------------
        place1InfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get value which input by user in text_View_Place1 and convert it to string
                String str1 = txtViewPlace1.getText().toString();

                Place plc1 = new Place();
                plc1 = CitySights.getPlace1();

                //now by putExtra method put the value in key, value pair key is
                //message_key by this key we will receive thw value, and put the string
                i.putExtra("message_key", str1); //send string
                i.putExtra("sampleObject", plc1);  //send object


                startActivity(i);
            }
        });

        //--------------------------------------------
        place2InfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //get value which input by user in text_View_Place1 and convert it to string
                String str2 = txtViewPlace2.getText().toString();

                Place plc2 = new Place();
                plc2 = CitySights.getPlace2();

                //now by putExtra method put the value in key, value pair key is
                //message_key by this key we will receive thw value, and put the string
                i.putExtra("message_key", str2); //send string
                i.putExtra("sampleObject", plc2);  //send object

                startActivity(i);

            }
        });

        //--------------------------------------------
        place3InfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //get value which input by user in text_View_Place1 and convert it to string
                String str3 = txtViewPlace3.getText().toString();

                Place plc3 = new Place();
                plc3 = CitySights.getPlace3();

                //now by putExtra method put the value in key, value pair key is
                //message_key by this key we will receive thw value, and put the string
                i.putExtra("message_key", str3);  //send string
                i.putExtra("sampleObject", plc3);  //send object

                startActivity(i);

            }
        });

        //TESTS - TESTS - TESTS - TESTS -----------------------------

        //TextView txtViewCity = findViewById(R.id.text_view_City);
        //txtViewCity.setText(CitySights.getName());
        //txtViewCity.setText("Serres");

        //TextView txtViewPlace1 = findViewById(R.id.text_View_Place1);
        //txtViewPlace1.setText(CitySights.getPlace1());
        //txtViewPlace1.setText("Akropolis");

        //TextView txtViewPlace2 = findViewById(R.id.text_View_Place2);
        //txtViewPlace2.setText(CitySights.getPlace2());
        //txtViewPlace2.setText("Agios Ioannis");

        //TextView txtViewPlace3 = findViewById(R.id.text_View_Place3);
        //txtViewPlace3.setText(CitySights.getPlace3());
        //txtViewPlace2.setText("Plateia Eleytherias");

    }
}