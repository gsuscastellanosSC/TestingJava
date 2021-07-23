package com.platzi.javatest.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void looses_when_say_number_is_too_low(){

        Dice say = Mockito.mock(Dice.class);
        Mockito.when(say.roll()).thenReturn(2);

        Player player = new Player(say, 5);
        assertFalse(player.play());
    }

    @Test
    public void looses_when_say_number_is_big(){

        Dice say = Mockito.mock(Dice.class);
        Mockito.when(say.roll()).thenReturn(4);

        Player player = new Player(say, 3);
        assertFalse(player.play());
    }

}