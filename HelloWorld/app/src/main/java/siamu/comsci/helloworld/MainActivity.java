package siamu.comsci.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    //ประกาศออบเจ๊กต์ของ Button หรือ EditText เพื่อ bundle ไปยัง Layout
    Button btnOpenActivity,btnDialer,btnMap,btnSave;
    EditText etName,etAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenActivity=(Button) findViewById(R.id.bt_open);
        btnDialer=(Button) findViewById(R.id.bt_phone);
        btnMap=(Button) findViewById(R.id.bt_map);
        btnSave=(Button) findViewById(R.id.bt_save);

        etName=(EditText) findViewById(R.id.et_name);
        etAddress=(EditText) findViewById(R.id.et_address);

        //กำหนดอีเวนท์ onClick ให้กับปุ่ม btnOpenActivity
        btnOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              openActivity();
            }
        });

        //กำหนดอีเวนท์ onClick ให้กับ btnDialer,btnMap โดยให้ไปทำงานที่เมธอด onClick
        btnDialer.setOnClickListener(this);

    }
    //เมธอดสำหรับเรียกใช้ Activity ใหม่ ด้วย Intent
    public void openActivity(){
        Intent intent=new Intent(this,Activity_Life_Cycle.class);
        startActivity(intent);
    }




    //เมธอดรองรับการทำงานเมื่อผู้ใช้คลิกปุ่ม Save

    public void saveData(View view) {

    }

    @Override
    public void onClick(View view) {

    }
}
