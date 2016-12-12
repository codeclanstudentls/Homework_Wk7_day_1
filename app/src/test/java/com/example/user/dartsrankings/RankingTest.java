package com.example.user.dartsrankings;

import org.junit.Before;
import org.junit.Test;

//import java.util.ArrayList;


/**
 * Created by user on 12/12/2016.
 */
public class RankingTest {

    Player player1;
    Player player2;
    Player player3;

    Ranking ranking;

    @Before
    public void before() {

        player1 = new Player("Jim Johnson", "Jimmy The Juggernaut", 1);
        player2 = new Player("Frank Flight", "Frankie Boy", 2);
        player3 = new Player("Billy Bragg", "B Da BullsEye", 3);

        ranking = new Ranking();

            ranking[0] = player1;
            ranking[1] = player2;
            ranking[2] = player3;
    }

    @Test
    public void


}
