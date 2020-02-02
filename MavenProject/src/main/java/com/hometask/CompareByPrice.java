package com.hometask;
import com.hometask.New_Year_Gift_Base_Class;

import java.util.Comparator;
public class CompareByPrice implements Comparator<New_Year_Gift_Base_Class> {
    public int compare(New_Year_Gift_Base_Class m1,New_Year_Gift_Base_Class m2)
    {
        return m1.getCurrentPrice()- m2.getCurrentPrice();
    }
}
