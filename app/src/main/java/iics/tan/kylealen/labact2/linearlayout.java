package iics.tan.kylealen.labact2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class linearlayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);

        final Button linearnext = (Button) findViewById(R.id.linearnext);
        linearnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveLinear = new Intent(getApplicationContext(),relativelayout.class);
                startActivity(moveLinear);
            }
        });
    }
}
