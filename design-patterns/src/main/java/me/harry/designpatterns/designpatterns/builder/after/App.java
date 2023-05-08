package me.harry.designpatterns.designpatterns.builder.after;

import me.harry.designpatterns.designpatterns.builder.before.TourPlan;

import java.time.LocalDate;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        /*
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .getPlan();

        TourPlan longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();

        System.out.println(plan);
        System.out.println(longBeachTrip);
        */

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunPlan = director.cancunTrip();
        TourPlan longBeachTrip = director.longBeachTrip();
        System.out.println(cancunPlan);
        System.out.println(longBeachTrip);
    }
}
