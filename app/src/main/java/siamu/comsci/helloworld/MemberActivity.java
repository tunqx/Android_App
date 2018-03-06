package siamu.comsci.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MemberActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        TextView tvName,tvAddress;
        tvName=(TextView)findViewById(R.id.tvname);
        tvAddress=(TextView)findViewById(R.id.tvaddress);


        Bundle bundle=this.getIntent().getExtras();

        Member member=(Member)bundle.getSerializable("member");
        tvName.setText(member.getName());
        tvAddress.setText(member.getAddress());
    }
}
