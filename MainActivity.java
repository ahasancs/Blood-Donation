package com.example.admin.textinputlayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Activity mActivity;
    private EditText inputID, inputPassword;
    private TextInputLayout inputLayoutId,inputLayoutPassword;

    private Button btnLogin, btnReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        mActivity = this;
        /*initialized in onCreate or any other function*/
        inputLayoutId = (TextInputLayout) findViewById(R.id.inputLayoutId);
        inputLayoutPassword= (TextInputLayout) findViewById(R.id.inputLayoutPassword);
        inputID = (EditText) findViewById(R.id.inputID);
        inputPassword= (EditText) findViewById(R.id.inputPassword);

        btnLogin = (Button)findViewById(R.id.btnLogin );
        btnReg= (Button)findViewById(R.id.btnReg);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getValue()){
                    //TODO, next step
                    Intent intent = new Intent(mContext, RegActivity.class);

                    startActivity(intent);

                    Toast.makeText(mContext,"Success",Toast.LENGTH_SHORT).show();
                }
                else{
                    //TODO, when else
                    Toast.makeText(mContext,"No data",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean getValue() {

        //if(validateUserID("mukti") && validateUserPass("12345")){
        if(validateUserID() && validateUserPass()){
            return true;
        }
        else
            return false;
    }

    /*Helping method*/
    private boolean validateUserID() {
        if (inputID.getText().toString().trim().isEmpty()) {
            inputLayoutId.setError(getString(R.string.loginUIDWrongId));
            //mActivity.requestFocus(inputID);
            return false;
        } else {
            inputLayoutId.setErrorEnabled(false);
        }
        return true;
    }

    private boolean validateUserPass() {
        if (inputPassword.getText().toString().trim().isEmpty()) {
            inputLayoutPassword.setError(getString(R.string.loginUIDWrongPass));
            //mActivity.requestFocus(inputID);
            return false;
        } else {
            inputLayoutPassword.setErrorEnabled(false);
        }
        return true;
    }
}
