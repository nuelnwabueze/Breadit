package com.example.android.breadit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.no_of_pages)
    TextView no_ofPages;
    @BindView(R.id.contact_info)
    TextView contactInfo;
    @BindView(R.id.link)
    TextView mlink;
    @BindView(R.id.line)
    View mline;
    @BindView(R.id.email)
    TextView memail;
    @BindView(R.id.ed)
    EditText mEd;
    @BindView(R.id.location)
    TextView mlocation;
    @BindView(R.id.ed2)
    EditText mEd2;
    @BindView(R.id.Transfer_btn)
    AppCompatButton mTransferBtn;
    @BindView(R.id.book)
    TextView mbook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        String word = mEd.getText().toString();
        String word2 = mEd2.getText().toString();

    }

    @OnClick(R.id.Transfer_btn)
    public void nextBtn() {
        Toast toast = Toast.makeText(this, "Finished", Toast.LENGTH_SHORT);
        toast.show();
    }
}
