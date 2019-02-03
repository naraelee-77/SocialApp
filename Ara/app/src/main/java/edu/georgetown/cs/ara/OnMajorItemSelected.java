package edu.georgetown.cs.ara;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class OnMajorItemSelected implements OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {

        Toast.makeText(parent.getContext(),
                "" + parent.getItemAtPosition(pos).toString(),
                Toast.LENGTH_SHORT).show();

        Profile.major = parent.getItemAtPosition(pos).toString();
//        MainActivity.majorDebug.setText(""+MainActivity.major);

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
