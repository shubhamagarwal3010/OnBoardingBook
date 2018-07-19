/*===============================================================================
Copyright (c) 2016-2018 PTC Inc. All Rights Reserved.

Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc. All Rights Reserved.

Vuforia is a trademark of PTC Inc., registered in the United States and other 
countries.
===============================================================================*/

package com.vuforia.samples.Books.app.Books;

import com.vuforia.samples.Books.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Custom View with Book Overlay Data
public class BookOverlayView extends RelativeLayout
{
    public BookOverlayView(Context context)
    {
        this(context, null);
    }
    
    
    public BookOverlayView(Context context, AttributeSet attrs)
    {
        this(context, attrs, 0);
    }
    
    
    public BookOverlayView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        inflateLayout(context);
        
    }
    
    
    // Inflates the Custom View Layout
    private void inflateLayout(Context context)
    {
        
        final LayoutInflater inflater = LayoutInflater.from(context);
        
        // Generates the layout for the view
        inflater.inflate(R.layout.bitmap_layout, this, true);
    }
    
    
    // Sets Book title in View
    public void setBookTitle(String bookTitle)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_title);
        tv.setText(bookTitle);
    }

    
    // Sets Book Cover in View from a bitmap
    public void setCoverViewFromBitmap(Bitmap coverBook)
    {
        ImageView iv = (ImageView) findViewById(R.id.thumbnail);
        iv.setImageBitmap(coverBook);
    }
}
