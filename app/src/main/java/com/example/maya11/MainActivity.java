package com.example.maya11;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Random;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Adb.
     */
    AlertDialog.Builder adb;
    /**
     * The View 1.
     */
    View view1;
    /**
     * The Si.
     */
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1= (View) findViewById(R.id.mlayout);
        si = new Intent(this,MainActivity2.class);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        String st = item.getTitle().toString();
        if(st.equals("Credits"))
        {
            startActivity(si);
        }
        return true;
    }

    /**
     * Choose random color.
     */
    public void chooseRandomColor()
    {
        Random rand = new Random();
        int int_random = rand.nextInt(7);
        switch(int_random)
        {
            case 0:
                view1.setBackgroundColor(Color.CYAN);
                break;
            case 1:
                view1.setBackgroundColor(Color.GREEN);
                break;
            case 2:
                view1.setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                view1.setBackgroundColor(Color.MAGENTA);
                break;
            case 4:
                view1.setBackgroundColor(Color.BLACK);
                break;
            case 5:
                view1.setBackgroundColor(Color.LTGRAY);
                break;
            case 6:
                view1.setBackgroundColor(Color.DKGRAY);
                break;
        }

    }

    /**
     * First alert.
     *
     * @param view the view
     */
    public void first_alert(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("my first alert");
        adb.setMessage("hello there :)");
        AlertDialog ad =adb.create();
        ad.show();
    }

    /**
     * Second alert.
     *
     * @param view the view
     */
    public void second_alert(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("my second alert");
        adb.setMessage("hello there :), here's an icon of a cat");
        adb.setIcon(R.drawable.cat);
        AlertDialog ad =adb.create();
        ad.show();
    }

    /**
     * Third alert.
     *
     * @param view the view
     */
    public void third_alert(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("my third alert");
        adb.setMessage("hello there :), here's an ok button");
        adb.setIcon(R.drawable.cat);
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog ad =adb.create();
        ad.show();
    }

    /**
     * Fourth alert.
     *
     * @param view the view
     */
    public void fourth_alert(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("my fourth alert");
        adb.setMessage("hello there :)");
        adb.setIcon(R.drawable.cat);
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        adb.setNegativeButton("change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                chooseRandomColor();
            }
        });
        AlertDialog ad =adb.create();
        ad.show();
    }

    /**
     * Fifth alert.
     *
     * @param view the view
     */
    public void fifth_alert(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("my fifth alert");
        adb.setMessage("hello there :)");
        adb.setIcon(R.drawable.cat);
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        adb.setNegativeButton("change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                chooseRandomColor();
            }
        });
        adb.setNeutralButton("default", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                view1.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad =adb.create();
        ad.show();
    }
}