package br.com.up.listadcompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class AddProductActivity extends AppCompatActivity {

    private TextInputEditText inputEditTextName;
    private TextInputEditText InputEditTextQuantity;
    private TextInputEditText InputEditTextDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);


        inputEditTextName = findViewById(R.id.input_text_name);

        String textProductName = inputEditTextName.getText().toString();

    }
}