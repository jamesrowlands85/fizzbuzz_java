package com.rowlands.katas.fizzbuzz

import spock.lang.Specification

class FizzBuzzSpec extends Specification {
    FizzBuzz fb

    def setup() {
        fb = new FizzBuzz()
    }

    def "return of fizzbuzz calculator"() {
        expect:
        fb.calculateResponse(number) == response

        where:
        number  | response
        1       | "1"
        3       | "fizz"
        5       | "buzz"
        6       | "fizz"
        9       | "fizz"
        10      | "buzz"
        15      | "fizzbuzz"
        30      | "fizzbuzz"

    }
}
