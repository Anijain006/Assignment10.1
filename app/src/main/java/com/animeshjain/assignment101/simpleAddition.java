package com.animeshjain.assignment101;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jain on 08-12-2017.
 */

//  Implementing Fragment class using simpleAddition Sub-Class
public class simpleAddition extends Fragment {

    //    Declaring Objects of the components
    TextView outputTxtView;
    EditText inputEdtTxt;
    Button displayBtn;
    //    Creating Constructor of the simpleAddition Class
    public  simpleAddition(){}
    @Nullable
    @Override
//    Declaring onCreate View
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.simple_addition, container, false);

        outputTxtView =(TextView) view.findViewById(R.id.outputTxtView);
        inputEdtTxt =(EditText)view.findViewById(R.id.inputEdtTxt);
        displayBtn =(Button)view.findViewById(R.id.displayBtn);

        displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Setting text to EditText From TextView
                outputTxtView.setText(inputEdtTxt.getText().toString());
            }
        });
        return view;
    }
}


