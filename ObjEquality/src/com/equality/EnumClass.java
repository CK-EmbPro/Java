package com.equality;

public class EnumClass {
    Day day;

    public EnumClass(Day day){
        this.day = day;
    }

    public void infoDay(){
        switch(day){
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so");
                break;

        }
    }

//    public static  void main(String[] args){
//        Day day1 = Day.TUESDAY;
//        System.out.println(day1.name());
//        System.out.println(day1.ordinal());
//    }

}
