package statistics.matcher;

import statistics.Player;

public class All implements Matcher {

    private Matcher matcher;

    public All(Matcher matcher) {
        this.matcher = matcher;
    }

    @Override
    public boolean matches(Player p) {
        if (matcher.matches(p)) {
            return true;
        }
        return false;
    }

}
