package com.course.model;

import lombok.Data;

@Data
public class Car {
    private int id;
    private int car_uid;
    private String plate_no;
    private String vin_code;
    private String engine_no;
    private int brand_id;
    private int power_type;
    private String color;
    private int seat_num;
    private int city_id;
    private int reg_city_id;
    private int station_id;
    private int park_remark_id;
    private String park_remark;
    private int fence_park;
    private int fence_safe;


}
