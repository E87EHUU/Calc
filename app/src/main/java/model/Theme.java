package model;

import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;

import com.example.calc.R;


public enum Theme {
    ONE(R.style.Theme_Calc_DefaultTheme, R.string.theme_1, "themeOne"),
    TWO(R.style.Theme_Calc_OrangeTheme, R.string.theme_2, "themeTwo"),
    THREE(R.style.Theme_Calc_BlueTheme, R.string.theme_3, "themeThree");

    @StyleRes
    private final int themeRes;
    @StringRes
    private final int title;

    private final String key;

    Theme(int themeRes, int title, String key) {
        this.themeRes = themeRes;
        this.title = title;
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public int getTitle() {
        return title;
    }

    public int getThemeRes() {
        return themeRes;
    }
}