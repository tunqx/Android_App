package siamu.comsci.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Activity_Life_Cycle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__life__cycle);
        showMessage( "Activity Created");
    }

    @Override
    protected void onStart(){
        super.onStart();
        showMessage("Activity Started");
    }

    @Override
    protected void onResume(){
        super.onResume();
        showMessage("Resume Activity");
    }

    @Override
    protected void onPause(){
        super.onPause();;
        showMessage("Pause Activity");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        showMessage("Restart Activity");
    }

    @Override
    protected void onStop(){
        super.onStop();
        showMessage("Activity Stopped");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        showMessage("Activity Destroyed");
    }

    private void showMessage(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();

    }
}
