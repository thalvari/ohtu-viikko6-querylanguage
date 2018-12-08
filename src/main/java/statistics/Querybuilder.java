package statistics;

import statistics.matcher.*;

import java.util.ArrayList;
import java.util.List;

public class Querybuilder {

    List<Matcher> matchers;

    public Querybuilder() {
        matchers = new ArrayList<>();
        matchers.add(new All());
    }

    public Matcher build() {
        return new And(matchers.toArray(new Matcher[matchers.size()]));
    }


    public Querybuilder playsIn(String team) {
        matchers.add(new PlaysIn(team));
        return this;
    }

    public Querybuilder hasAtLeast(int value, String category) {
        matchers.add(new HasAtLeast(value, category));
        return this;
    }

    public Querybuilder hasFewerThan(int value, String category) {
        matchers.add(new HasFewerThan(value, category));
        return this;
    }

}
