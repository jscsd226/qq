package practise.hp.example.com.qq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class successActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);


        Button button=(Button)findViewById(R.id.m_exit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String nickName=bundle.getString("nickName");
        TextView textView=(TextView)findViewById(R.id.nickname);
        textView.setText("User:"+nickName);
    }
}
