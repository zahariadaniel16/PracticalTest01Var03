package ro.pub.cs.systems.eim.practicaltest03.practicaltest01var03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class PraticalTest01Var03MainActivity extends AppCompatActivity {


    private EditText firstEditText = null;
    private EditText secondEditText = null;
    private EditText displayEditText = null;

    private Button navigateToSecondaryActivityButton = null;
    private Button displayInformationButton = null;

    private CheckBox firstCheckbox = null;
    private CheckBox secondCheckbox = null;


    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String info = "";
            if (firstCheckbox.isChecked()) {
                info += String.valueOf(firstEditText.getText().toString());
            }
            info += " ";
            if (secondCheckbox.isChecked()) {
                info += String.valueOf(secondEditText.getText().toString());
            }
            displayEditText.setText(info);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratical_test01_var03_main);


        firstEditText = (EditText)findViewById(R.id.first_edit_text);
        secondEditText = (EditText)findViewById(R.id.second_edit_text);
        displayEditText = (EditText)findViewById(R.id.display_edit_text);

        navigateToSecondaryActivityButton = (Button)findViewById(R.id.navigate_to_secondary_activity_button);
        displayInformationButton = (Button)findViewById(R.id.display_information_button);

        firstCheckbox = (CheckBox)findViewById(R.id.first_checkbox);
        secondCheckbox = (CheckBox)findViewById(R.id.second_checkbox);

        displayInformationButton.setOnClickListener(buttonClickListener);


        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("firsttext")) {
                firstEditText.setText(savedInstanceState.getString("firsttext"));
            } else {
                firstEditText.setText(String.valueOf(""));
            }
            if (savedInstanceState.containsKey("secondtext")) {
                secondEditText.setText(savedInstanceState.getString("secondtext"));
            } else {
                secondEditText.setText(String.valueOf(""));
            }
            if (savedInstanceState.containsKey("infotext")) {
                displayEditText.setText(savedInstanceState.getString("infotext"));
            } else {
                displayEditText.setText(String.valueOf(""));
            }
        } else {
            firstEditText.setText(String.valueOf(""));
            secondEditText.setText(String.valueOf(""));
            displayEditText.setText(String.valueOf(""));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("firsttext", firstEditText.getText().toString());
        savedInstanceState.putString("secondtext", secondEditText.getText().toString());
        savedInstanceState.putString("infotext", displayEditText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState.containsKey("firsttext")) {
            firstEditText.setText(savedInstanceState.getString("firsttext"));
        } else {
            firstEditText.setText(String.valueOf(""));
        }
        if (savedInstanceState.containsKey("secondtext")) {
            secondEditText.setText(savedInstanceState.getString("secondtext"));
        } else {
            secondEditText.setText(String.valueOf(""));
        }
        if (savedInstanceState.containsKey("infotext")) {
            displayEditText.setText(savedInstanceState.getString("infotext"));
        } else {
            displayEditText.setText(String.valueOf(""));
        }
    }

}
