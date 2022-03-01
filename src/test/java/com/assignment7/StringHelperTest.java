package com.assignment7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

    // AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

    StringHelper helper;

    @Before
    public void before(){
        helper = new StringHelper();
    }


    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
        assertEquals("CO", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));

    }

    // ABCD => false, ABAB => true, AB => true, A => false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        assertFalse(
                helper.areFirstAndLastTwoCharactersTheSame("Abbb"));

    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(
                helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }


}

//class PriceTest {
//
//    private static Stream<Arguments> totalCostParameters() {
//        return Stream.of(
//                Arguments.of(10, asList(createMarkup(10)), 10, 30),
//                Arguments.of(0, asList(createMarkup(10), createMarkup(20)), 10, 40),
//                Arguments.of(5, asList(), 10, 15),
//                Arguments.of(5, asList(), 0, 5),
//                Arguments.of(0, asList(createMarkup(5)), 0, 5),
//                Arguments.of(0, asList(), 5, 5),
//                Arguments.of(2, null, 5, 7)
//        );
//    }
//
//    private static Markup createMarkup(int amount) {
//        Markup markup = new Markup();
//        markup.setAmount((float)(amount));
//        return markup;
//    }
//
//    @ParameterizedTest
//    @MethodSource("totalCostParameters")
//    public void testTotalCost(float cost, List<Markup> markups, float tax, float total) {
//        Price price = new Price();
//        price.setCost(cost);
//        price.setMarkups(markups);
//        price.setTax(tax);
//
//        assertThat(price.totalPrice()).isEqualTo(total);
//    }
//
//}

