/*===============================================================================
Copyright (c) 2016 PTC Inc. All Rights Reserved.

Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc. All Rights Reserved.

Vuforia is a trademark of PTC Inc., registered in the United States and other 
countries.
===============================================================================*/

package com.vuforia.samples.Books.app.Books;

import android.graphics.Bitmap;


// A support class encapsulating the info for one book
public class Target
{
    private String title;
    private String targetId;
    private Bitmap thumb;
    private String bookUrl;
    
    
    public Target()
    {
        
    }
    
    
    public String getTitle()
    {
        return title;
    }
    
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTargetId()
    {
        return targetId;
    }
    
    
    public void setTargetId(String targetId)
    {
        this.targetId = targetId;
    }
    
    
    public Bitmap getThumb()
    {
        return thumb;
    }
    
    
    public void setThumb(Bitmap thumb)
    {
        this.thumb = thumb;
    }
    
    
    public String getBookUrl()
    {
        return bookUrl;
    }
    
    
    public void setBookUrl(String bookUrl)
    {
        this.bookUrl = bookUrl;
    }
    
    
    public void recycle()
    {
        // Cleans the Thumb bitmap variable
        thumb.recycle();
        thumb = null;
    }
}
