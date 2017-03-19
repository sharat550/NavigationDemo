package com.example.csharath.navigationdemo.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.csharath.navigationdemo.R;

/**
 * Created by CSharath on 12/8/2016.
 */

public class Slideshow extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootview=inflater.inflate(R.layout.slideshow,container,false);
        return rootview;
    }
}
