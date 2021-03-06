package com.lemondev.weather.ui.adapters;

/**
 * 2022/2/23
 * Created by vibrantBobo
 */

public interface ViewType {
    int HEADER = 0;
    int DAILY = 1;
    int HOURLY = 2;

    int FOOTER = -1;

    //more...

    int TEMPERATURE = 100;
    int HUMIDITY = 101;
    int AIR_QUALITY = 102;
    int SUN_CONDITION = 103;
}
