final class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(final int input) {
        //sum(x) = x * (x+1) / 2
        final int sum = input * (input + 1) / 2;
        return sum * sum;
    }

    int computeSumOfSquaresTo(final int input) {
        //sum(x^2) = x * (x+1) * (2x+1) / 6
        return input * (input + 1) * (2 * input + 1) / 6;
    }

    int computeDifferenceOfSquares(final int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}