# Gilded Rose Refactoring Kata - Java Branch

This Kata is a practice for handling a legacy code situation, and is also really useful for practicing writing good tests using different frameworks and approaches.

## How I refactored this Kata

1. Read the [requirements text](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements.txt) to get an general idea about the exercise
2. Wrote a test that covers the whole code and detects any changes in the code logic
3. Started dividing the code into logic parts and extracted those parts into functions and ensured that the test still passed
4. Identified that the usage of those functions can be redesigned by combining strategy and factory patterns
5. Implemented a class using these patterns and ensured that the test still passed

*You can see the original code without refactoring on the [main branch](https://github.com/AhmedIbrahimAbdellatif/GildedRose-Refactoring-Kata/tree/main)*

***

