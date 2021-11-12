package com.example.mvvmvsmvp.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmvsmvp.R;

public class MvpActivity extends AppCompatActivity implements InterfaceView {

    private EditText mEditText;
    private TextView mTextView;
    private MvpPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);

        mEditText = this.findViewById(R.id.et_input);
        mTextView = this.findViewById(R.id.tv_output);
        mPresenter = new MvpPresenter(this);

        mEditText.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        mPresenter.onInputReceived(s.toString());
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                }
        );
    }

    @Override
    public void updateOutputTextView(String content) {
        mTextView.setText(content);
    }
}