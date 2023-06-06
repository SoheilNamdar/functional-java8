package football.player;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class PlayerShould {
    @Test
    void give_the_best_scorer() {
        final List<Player> scorers = new LinkedList<>();
        scorers.add(new Player("Cristiano Ronaldo", 115));
        scorers.add(new Player("Ali DAEI", 109));
        scorers.add(new Player("Lionel Messi", 102));
        scorers.add(new Player("Mokhtar Dahari", 89));
        scorers.add(new Player("Sunil Chhetri", 85));

        Player bestScorer = scorers.get(0);
        for (Player scorer : scorers) {
            if (scorer.getGoal() > bestScorer.getGoal())
                bestScorer = scorer;
        }
        assertThat(bestScorer.getName()).isEqualTo("Cristiano Ronaldo");
        //System.out.println(bestScorer.getName());
    }
}
