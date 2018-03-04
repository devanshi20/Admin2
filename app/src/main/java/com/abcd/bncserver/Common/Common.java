package com.abcd.bncserver.Common;

import com.abcd.bncserver.Model.User;
import com.google.firebase.database.DatabaseReference;

/**
 * Created by Karan Patel on 21-01-2018.
 */

public class Common {
    public static DatabaseReference currentUser;

    public static final String UPDATE="Update";
    public static final String DELETE="Delete";
    public static final int PICK_IMAGE_REQUEST=71;


    public static String codeConversion(String code)
    {
        if (code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "On The Way";
        else
            return "Shipped";
    }


}
