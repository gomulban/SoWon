package com.example.sowon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class InsertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        final EditText edittext=(EditText)findViewById(R.id.edittext);
        Button button=(Button)findViewById(R.id.button);
        final TextView textView=(TextView)findViewById(R.id.textview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(edittext.getText());
//                textView.setText(getWillList().toString());
            }
        });
    }

    private ArrayList<Will> getWillList() {
        ArrayList<Will> listWill = new ArrayList<>();
        Gson gson = new Gson();

        try {
            InputStream is = getAssets().open("will.json");
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            is.close();
            String json = new String(buffer, "UTF-8");

            JSONObject jsonObject = new JSONObject(json);
            JSONArray jsonArray = jsonObject.getJSONArray("album");

            int index = 0;

            while (index < jsonArray.length()) {
                Will will = gson.fromJson(jsonArray.get(index).toString(), Will.class);

                listWill.add(will);
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listWill;
    }
}
