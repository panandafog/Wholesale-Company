package panandafog.wholesale_company.model;

import javax.persistence.*;

//
//public class DailyDemand {
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private Long id;
//    @Column(name = "day", nullable = false)
//    private int day;
//    @Column(name = "good_count", nullable = false)
//    private int goodCount;
//
//    public DailyDemand() {
//    }
//
//    public DailyDemand(int day, int goodCount) {
//        this.day = day;
//        this.goodCount = goodCount;
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        this.day = day;
//    }
//
//    public int getGoodCount() {
//        return goodCount;
//    }
//
//    public void setGoodCount(int goodCount) {
//        this.goodCount = goodCount;
//    }
//}

public interface DailyDemand {

    Integer getDay();

    Float getGood_count();
}
