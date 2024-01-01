package leetcode.twoHundredSeventyOne_encodeDecodeStrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncodeDecodeStringsTest {

    @ParameterizedTest
    @MethodSource("stringsTestData")
    void shouldEncodeAndDecodeAsExpected(List<String> decoded, String encoded) {
        // given
        EncodeDecodeStrings encoderDecoder = new EncodeDecodeStrings();

        // when-then: encoding
        assertEquals(encoded, encoderDecoder.encode(decoded));

        // when-then: decoding
        assertEquals(decoded, encoderDecoder.decode(encoded));
    }

    private static Stream<Arguments> stringsTestData() {
        return Stream.of(
                Arguments.of(List.of("lint", "code", "love", "you"), "4#lint4#code4#love3#you"),
                Arguments.of(List.of("we", "say", "#", "yes"), "2#we3#say1##3#yes")
        );
    }
}