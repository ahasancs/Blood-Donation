package com.example.admin.textinputlayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {

    private Context mContext;
    private Activity mActivity;
    private EditText Reguname, regAddress, regemail,regcontact,regbgroup,regdate, image;
    private TextInputLayout Reg_layoutId,inputLayoutregAddress,inputLayoutemail,inputLayoutregcontact,
            inputLayoutregBgroup,inputLayoutregdate,inputLayoutimage;

    private  Button btnsave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        mContext = this;
        mActivity = this;


        Reg_layoutId=(TextInputLayout) findViewById(R.id.Reg_layoutId);
        inputLayoutregAddress=(TextInputLayout) findViewById(R.id.inputLayoutregAddress);
        inputLayoutemail=(TextInputLayout) findViewById(R.id.inputLayoutemail);
        inputLayoutregcontact=(TextInputLayout) findViewById(R.id.inputLayoutregcontact);
        inputLayoutregBgroup=(TextInputLayout) findViewById(R.id.inputLayoutregBgroup);
        inputLayoutregdate=(TextInputLayout) findViewById(R.id.inputLayoutregdate);

        Reguname=(EditText)findViewById(R.id.Reguname);
        regAddress=(EditText)findViewById(R.id.regAddress);
        regemail=(EditText)findViewById(R.id.regemail);
        regcontact=(EditText)findViewById(R.id.regcontact);
        regbgroup=(EditText)findViewById(R.id.regbgroup);
        regdate=(EditText)findViewById(R.id.regdate);
        image=(ImageView)findViewById(R.id.image);


        btnsave=(Button)findViewById(R.id.btnsave);


        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getVule()){
                    //TODO, next step
                    Intent intent = new Intent(mContext, HomeActivity.class);

                    startActivity(intent);

                    Toast.makeText(mContext,"Success registation",Toast.LENGTH_SHORT).show();
                }
                else{
                    //TODO, when else
                    Toast.makeText(mContext,"registation fail",Toast.LENGTH_SHORT).show();
                }

            }
        });




    }


}
