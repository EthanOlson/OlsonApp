package com.olson.asc2.olsonapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.io.Reader;

public class MainActivity extends ActionBarActivity
{
    private static final String DEBUG_TAG = "HttpExample";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void findSong(View v) throws Exception
    {
        //creates url to search genius
        EditText lyrics = (EditText) (findViewById(R.id.editText));
        char[] search = lyrics.getText().toString().toCharArray();
        String add = "";
        for (char x : search)
        {
            if (x == ' ') ;
                x = '+';
            add += x;
        }
        //String urlSearch = "http://genius.com/search?q="+add;

            //beta version

        Uri a = Uri.parse("http://genius.com/search?q="+add);
        Intent i = new Intent(Intent.ACTION_VIEW, a);
        startActivity(i);

            //final version


    }
}