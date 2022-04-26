import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time {


    private int hh, mm, ss;

    public Time(int hh_, int mm_, int ss_) {
        set_hh(hh_);
        set_mm(mm_);
        set_ss(ss_);
    }
    public Time(int hh_, int mm_){
        this(hh_,mm_,0);
    }
    public Time(){
        this(0,0,0);
    }

    public void set_hh(int hh_) {
        if (hh_ < 0 || hh_ > 23)
            hh = 0;
        else
            hh = hh_;
    }

    public void set_mm(int mm_) {
        if (mm_ < 0 || mm_ > 59)
            mm = 0;
        else
            mm = mm_;
    }

    public void set_ss(int ss_) {
        if (ss_ < 0 || ss_ > 59)
            ss = 0;
        else
            ss = ss_;
    }
    public int hours(){
        return hh;
    }
    public  int minutes(){
        return mm;
    }
    public  int seconds(){
        return ss;
    }
    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }
    static Time read(Scanner sc){
        Time time = new Time();
        System.out.println("hh: ");
        time.set_hh(sc.nextInt());
        System.out.println("mm: ");
        time.set_mm(sc.nextInt());
        System.out.println("ss: ");
        time.set_ss(sc.nextInt());
        return time;
    }
    public void add_seconds (int ss_ ){
        ss += ss_;
        mm += ss / 60;
        ss = ss % 60;
        hh += mm / 60;
        mm = mm % 60;
        hh = hh % 24;
    }
    public void add_minutes (int mm_) {
        add_seconds(mm_ * 60);
    }
    public void add_hours (int hh_) {
        add_seconds(hh_ * 60 * 60);
    }


    public static void main(String[] args) {
        Date dateNow = new Date();
        System.out.println("___________________________________________");
        SimpleDateFormat format = new SimpleDateFormat("E yyyy.MMM.dd 'и время' hh : mm : ss a zz ");
        System.out.println(format.format(dateNow));
        System.out.println("-------------------------------------------\n");

        Time time = new Time(23, 59, 59);
        Time time2= new Time(50, 3, 88);
        Time time3 = new Time( 24,55,73);
        time.print();
        time2.print();
        time3.print();
        System.out.println("--------");
        time.set_hh(25);
        time.set_mm(22);
        time.set_ss(50);
        time2.add_seconds(50);
        time3.add_seconds(70);
        time.print();
        time2.print();
        time3.print();
        System.out.println("--------");
        time.add_minutes(20);
        time2.add_hours(3);
        time3.add_hours(33);
        time.print();
        time2.print();
        time3.print();
        System.out.println("--------");
        }
    }






