package com.example.user.dartsrankings;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
/**
 * Created by user on 12/12/2016.
 */
public class PlayerTest {

    Player player1;
    Player player2;
    Player player3;

    @Before
    public void before() {
        player1 = new Player("Jim Johnson", "Jimmy The Juggernaut", 1);
        player2 = new Player("Frank Flight", "Frankie Boy", 2);
        player3 = new Player("Billy Bragg", "B Da BullsEye", 3);

    }

    @Test
    public void canGetNameTest() {
        assertEquals("Jim Johnson", player1.getName());
    }

    @Test
    public void canGetNickname() {
        assertEquals("Jimmy The Juggernaut", player1.getNickname());
    }

    @Test
    public void canGetRanking() {
        assertEquals(1, player1.getRanking());
    }

    @Test
    public void canSetName() {
        player1.setName("Jim Johnson");
        assertEquals("Jim Johnson",player1.getName());

    }

    @Test
    public void canSetNickname() {
        player1.setName("Jimmy The Juggernaut");
        assertEquals("Jimmy The Juggernaut",player1.getNickname());

    }

    @Test
    public void canSetRanking() {
        assertEquals(1, player1.getRanking());
        player1.setRanking(2);
        assertEquals(2, player1.getRanking());
    }

    @Test
    public void canGetPlayerToString() {
        assertEquals("Name: Jim Johnson, Nickname: Jimmy The Juggernaut, Ranking: 1", player1.toString());

    }
}
