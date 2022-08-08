import java.text.DecimalFormat;

public class MyTime {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour,minute,second);
    }
    public void setTime (int hour,int minute,int second)throws IllegalArgumentException{
        if (hour>=0&&hour<=23){
            this.hour = hour;}else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        if (minute>=0&&minute<=59){
            this.minute = minute;}else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        if (second>=0&&second<=59){
            this.second = second;}else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour>=0&&hour<=23){
            this.hour = hour;}else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute>=0&&minute<=59){
            this.minute = minute;}else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second>=0&&second<=59){
            this.second = second;}else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }
    public MyTime nextSecond(){
if (this.second==59){
    this.second=0;
    nextMinute();}else {this.second+=1;}
  return this;  }
    public MyTime nextMinute(){
        if (this.minute==59){
            this.minute=0;
            nextHour();}else {this.minute+=1;}
        return this;  }
    public MyTime nextHour(){
        if (this.hour==23){
            this.hour=0;
           }else {this.hour+=1;}
        return this;  }

    public MyTime previousSecond(){
        if (this.second==0){
            this.second=59;
           previousMinute();}else {this.second-=1;}
        return this;  }

    public MyTime previousMinute(){
        if (this.minute==0){
            this.minute=59;
            previousHour();}else {this.minute-=1;}
        return this;  }

    public MyTime previousHour(){
        if (this.hour==0){
            this.hour=23;
            }else {this.hour-=1;}
        return this;  }

    @Override
    public String toString() {
        DecimalFormat time=new DecimalFormat("00");
        return
                time.format(hour)+':' +time.format(minute)+':' + time.format(second);
    }
}
