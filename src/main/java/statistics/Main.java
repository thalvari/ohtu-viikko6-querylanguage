package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

//        Matcher m = new And(
//                new HasAtLeast(10, "goals"),
//                new HasAtLeast(10, "assists"),
//                new PlaysIn("PHI")
//        );

//        Matcher m = new All();

//        Matcher m = new Not(new HasAtLeast(1, "goals"));

//        Matcher m = new Or(
//                new HasAtLeast(40, "goals"),
//                new HasAtLeast(60, "assists"),
//                new HasAtLeast(85, "points")
//        );

//        Matcher m = new HasFewerThan(1, "goals");

        Querybuilder query = new Querybuilder();

//        Matcher m = query.build();

//        Matcher m = query.playsIn("NYR").build();

        Matcher m = query.playsIn("NYR")
                .hasAtLeast(10, "goals")
                .hasFewerThan(25, "goals").build();

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }
    }

}
