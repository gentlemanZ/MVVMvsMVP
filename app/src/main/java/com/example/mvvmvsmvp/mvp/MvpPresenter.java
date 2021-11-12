package com.example.mvvmvsmvp.mvp;

public class MvpPresenter {
    private String input = "";
    private String output = "";
    private InterfaceView view;

    public MvpPresenter(InterfaceView view) {
        this.view = view;
    }

    public void onInputReceived(String content) {
        input = content;
        output = input;
        view.updateOutputTextView(output);
    }
}
