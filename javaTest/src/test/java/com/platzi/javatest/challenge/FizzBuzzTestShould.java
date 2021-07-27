package com.platzi.javatest.challenge;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class FizzBuzzTestShould {

    @Test
    public void if_num_divisible_by_three_return_fizz(){
        assertThat(FizzBuzz.fizzBuzz(9), is("Fizz"));
    }

    @Test
    public void if_num_divisible_by_five_return_Buzz(){
        assertThat(FizzBuzz.fizzBuzz(50), is("Buzz"));
    }

    @Test
    public void if_num_divisible_by_three_and_five_return_FizzBuzz(){
        assertThat(FizzBuzz.fizzBuzz(90), is("FizzBuzz"));
    }

    @Test
    public void if_num_not_divisible_by_three_neither_by_five_return_num(){
        assertThat(FizzBuzz.fizzBuzz(851), is("851"));
    }
}