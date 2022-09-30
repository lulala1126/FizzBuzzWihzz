package com.tw.capability;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    static Stream<Arguments> divisionArguments() {
        return Stream.of(
                Arguments.of(6, "Fizz"),
                Arguments.of(10, "Buzz"),
                Arguments.of(14, "Whizz"),
                Arguments.of(60, "FizzBuzz"),
                Arguments.of(140, "BuzzWhizz"),
                Arguments.of(84, "FizzWhizz"),
                Arguments.of(210, "FizzBuzzWhizz")
        );
    }
    @ParameterizedTest
    @MethodSource("com.tw.capability.FizzBuzzTest#divisionArguments")
    void should_return_FizzBuzzWhizz_when_inputNum_can_divBy_357(int inputNum, String transStr){

        String result = FizzBuzz.transNumByDiv(inputNum);

        assertEquals(transStr,result);
    }

    static Stream<Arguments> container3TestArguments() {
        return Stream.of(
                Arguments.of(3, "Fizz"),
                Arguments.of(13, "Fizz"),
                Arguments.of(23, "Fizz"),
                Arguments.of(12, null),
                Arguments.of(33, "Fizz")
        );
    }
    @ParameterizedTest
    @MethodSource("com.tw.capability.FizzBuzzTest#container3TestArguments")
    void should_return_Fizz_when_inputNum_container_three(int inputNum, String transStr){

        String result = FizzBuzz.transNumByContainerThree(inputNum);

        assertEquals(transStr,result);
    }

    static Stream<Arguments> container5TestArguments() {
        return Stream.of(
                Arguments.of(5, "Buzz"),
                Arguments.of(15, "Buzz"),
                Arguments.of(35, "BuzzWhizz"),
                Arguments.of(10, null)
        );
    }
    @ParameterizedTest
    @MethodSource("com.tw.capability.FizzBuzzTest#container5TestArguments")
    void should_return_Buzz_when_inputNum_container_five(int inputNum, String transStr){

        String result = FizzBuzz.transNumByContainerFive(inputNum);

        assertEquals(transStr,result);
    }

    static Stream<Arguments> container7TestArguments() {
        return Stream.of(
                Arguments.of(7, null),
                Arguments.of(37, null),
                Arguments.of(75, "Fizz"),
                Arguments.of(14, null)
        );
    }
    @ParameterizedTest
    @MethodSource("com.tw.capability.FizzBuzzTest#container7TestArguments")
    void should_return_Whizz_when_inputNum_container_seven(int inputNum, String transStr){

        String result = FizzBuzz.transNumByContainerSeven(inputNum);

        assertEquals(transStr,result);
    }
}
