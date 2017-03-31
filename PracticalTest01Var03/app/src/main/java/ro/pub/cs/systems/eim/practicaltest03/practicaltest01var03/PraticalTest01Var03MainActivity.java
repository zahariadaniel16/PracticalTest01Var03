package ro.pub.cs.systems.eim.practicaltest03.practicaltest01var03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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




    }
}
