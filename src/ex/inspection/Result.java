package ex.inspection;

import javax.management.MBeanParameterInfo;
import basic.sample.enumsample.Gender;
class Result {
    private String id,name,dateTime; //ID、名前、検査日時
    private double bT; //体温
    private int pulse,sBP,dBP; //脈拍、収縮・拡張血圧
    private Gender gender;
    private String ps;

    public Result(String id, String name, String dateTime,
                  double bT, int pulse, int sBP, int dBP,
                  Gender gender,String ps) {

        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.bT = bT;
        this.pulse = pulse;
        this.sBP = sBP;
        this.dBP = dBP;
        this.gender=gender;
        this.ps=ps;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public double getbT() {
        return bT;
    }

    public int getPulse() {
        return pulse;
    }

    public int getsBP() {
        return sBP;
    }

    public int getdBP() {
        return dBP;
    }

    public double getMBP(){
        return dBP +(sBP-dBP)/3;    //平均血圧

    }

    public Gender getGender() {
        return gender;
    }

    public String getPs() {
        return ps;
    }

    @Override
    public String toString() {
    return String.format("%s %s %s %.2f %d %d %d %.1f %s 特記事項:%s",
        id,name,dateTime,bT,pulse,sBP,dBP,getMBP(),gender.getJpName(),ps);
    }



}
