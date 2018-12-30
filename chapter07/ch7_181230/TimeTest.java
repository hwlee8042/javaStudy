package chapter07.ch7_181230;

/*
접근제어자를 private으로 하여 외부의 직접 접근을 막는 방법
> Getter, setter사용하기
get매소드 : 맴버변수의 값을 읽어오는 매소드
set매소드 : 맴버변수의 값을 변경할 때 사용하는 매소드
*/
class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);        
        //t.hour = 13; //error 제어자가 privat으로 해당 변수 직접접근불가.
        t.setHour(t.getHour() + 1); //현재시간보다 1시간 후로 변경
        System.out.println(t);
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        setHour(hour);
        setMinte(minute);
        setSecond(second);
    }

    public int getHour(){ return hour; }
    public void setHour(int hour){
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute(){ return minute; }
    public void setMinte(int minute){
        if(minute < 0 || minute >  59) return;
        this.minute = minute;
    }

    public int getSecond(){ return second; }
    public void setSecond(int second){
        if(second < 0 || second >59){
            this.second = second;
        }
    }

    public String toString() {
        return hour + " : " + minute + " : " + second;
    }
}