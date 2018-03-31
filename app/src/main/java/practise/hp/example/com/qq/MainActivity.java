package practise.hp.example.com.qq;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public static final class Data {
        public static   String[][]USERS={{"0001","123456","basillee"}
                ,{"0002","123456","basillee2"},{"0003","123456","basillee3"}};
    }

    private  void testImitateQQ(){
        Button login=(Button)findViewById(R.id.login);
        Button exit=(Button)findViewById(R.id.exit);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=((EditText)findViewById(R.id.editText1)).getText().toString();
                String password=((EditText)findViewById(R.id.editText2)).getText().toString();
                boolean flag=false;
                String nickName="";
                for(int i=0;i< Data.USERS.length;i++){
                    if(number.equals(Data.USERS[i][0])){
                        if(password.equals(Data.USERS[i][1])){
                            nickName=Data.USERS[i][2];
                            flag=true;
                            break;
                        }
                    }
                }
                if(flag){
                    Intent intent=new Intent(MainActivity.this,ImitateQQ.class);
                    Bundle bundle=new Bundle();
                    bundle.putString("nickName",nickName);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"wrong account or password",Toast.LENGTH_LONG).show();
                }
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
