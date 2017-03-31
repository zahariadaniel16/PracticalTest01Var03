package ro.pub.cs.systems.eim.practicaltest03.practicaltest01var03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PracticalText01Var03SecondaryActivity extends AppCompatActivity {

    private TextView studentNameTextView = null;
    private TextView studentGroupTextView = null;

    private Button okButton = null;
    private Button cancelButton = null;


    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.ok_button:
                    setResult(RESULT_OK, null);
                    break;
                case R.id.cancel_button:
                    setResult(RESULT_CANCELED, null);
                    break;
            }
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_text01_var03_secondary);

        studentNameTextView = (TextView)findViewById(R.id.student_name);
        studentGroupTextView = (TextView)findViewById(R.id.student_group);
        Intent intent = getIntent();
        if (intent != null) {
            String studentName = intent.getStringExtra("name");
            studentNameTextView.setText(String.valueOf(studentName));
            String studentGroup = intent.getStringExtra("group");
            studentGroupTextView.setText(String.valueOf(studentGroup));
        }

        okButton = (Button)findViewById(R.id.ok_button);
        okButton.setOnClickListener(buttonClickListener);
        cancelButton = (Button)findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(buttonClickListener);

    }
}
