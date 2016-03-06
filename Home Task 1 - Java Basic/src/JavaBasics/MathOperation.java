package JavaBasics;

public class MathOperation {

	/**
	 * Returns the greatest common divider of given two numbers
	 * 
	 * @param firstNumber
	 *            - positive number
	 * @param secondNumber
	 *            - positive number
	 * @return greatest common divider of two numbers
	 */
	public int getCommonDivisor(int firstNumber, int secondNumber) {
		while (secondNumber != 0) {
			int t = firstNumber % secondNumber;
			firstNumber = secondNumber;
			secondNumber = t;
		}
		return firstNumber;

	}

	/**
	 * Returns sum of digits of the given number
	 * 
	 * @param number
	 *            - positive number
	 * @return the sum of digits of the given number
	 */
	public int getSumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	/**
	 * Checks if the given number is prime or not
	 * 
	 * @param number
	 * @return true - if number is prime, if not return false
	 */
	public boolean isPrime(int number) {
		if (number == 1)
			return false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * Returns sum of row: 1! - 2! + 3! - 4! + 5! - 6! + n!
	 * 
	 * @param n
	 *            - positive number
	 */
	int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}

	public int getSumOfRow(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				result -= fact(i);
			else
				result += fact(i);
		}
		return result;
	}

	public int getSixDigitNumbersCount() {
		int kol = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int q = 0; q <= 9; q++) {
					for (int k = 0; k <= 9; k++) {
						for (int r = 0; r <= 9; r++) {
							for (int l = 0; l <= 9; l++) {
								if (i + j + q == k + r + l)
									kol++;
							}

						}

					}

				}

			}
		}
		return kol;
	}

	/**
	 * Returns Fibonacci series of a specified length
	 * 
	 * @param length
	 *            - the length of the Fibonacci series
	 * @return array filled with Fibonacci series
	 */
	public int[] getFibonacciSeries(int length) {
		int[] array = new int[length];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		return array;
	}

	/**
	 * Returns array with prime numbers
	 * 
	 * @param length
	 *            - the length of prime numbers series
	 * @return array filled with prime numbers
	 */
	public int[] getPrimeSeries(int length) {
		int[] array = new int[length];

		int num = 2;
		for (int i = 0; i < array.length; i++) {
			while (!isPrime(num)) {
				num++;
			}
			array[i] = num;
			num++;
		}

		return array;
	}

	/**
	 * Prints to console chessboard using arrays b - black square w - white
	 * square
	 * 
	 * the output should be like the following
	 * 
	 * w b w b w b w b b w b w b w b w w b w b w b w b b w b w b w b w w b w b w
	 * b w b b w b w b w b w w b w b w b w b b w b w b w b w
	 */
	public void printChessboard() {
		int length = 5;
		char[][] array = new char[length][length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j % 2 == 0)
					array[i][j] = 'w';
				else
					array[i][j] = 'b';
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}
	public int createSixDimensionArray() {
		int kol = 0;
		int[][][][][][] array = new int[2][2][2][2][2][2];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				for (int t = 0; t < array.length; t++) {
					for (int k = 0; k < array.length; k++) {
						for (int q = 0; q < array.length; q++) {
							for (int l = 0; l < array.length; l++) {
								array[i][j][t][k][q][l] = ++kol;
							}
						}
					}
				}
			}
		}
		return kol;
	}

	/**
	 * Prints to console Pascal's triangle with the given number of rows
	 * 
	 * @param numberOfRows
	 *            the number of rows in the triangle
	 */
	public void printPascalsTriangle(int numberOfRows) {
		int[][] trin = new int[numberOfRows][];
		trin[0] = new int[1];
		System.out.println(trin[0][0] = 1);
		for (int i = 1; i < numberOfRows; i++) {
			trin[i] = new int[i + 1];
			System.out.print((trin[i][0] = 1) + " ");
			for (int j = 1; j < i; j++) {
				System.out.print((trin[i][j] = trin[i - 1][j - 1] + trin[i - 1][j]) + " ");
			}
			System.out.println(trin[i][i] = 1);
		}
	}

	public static void main(String[] args) {
		MathOperation math = new MathOperation();

		math.getCommonDivisor(10, 15); // 5
		math.getSumOfDigits(123456); // 21
		math.isPrime(7); // true
		math.isPrime(10); // false
		math.getSumOfRow(5);
		math.getSixDigitNumbersCount();
		math.getFibonacciSeries(10); // [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
		math.getPrimeSeries(5); // 1, 3, 5, 7, 11
		math.printChessboard();
		math.createSixDimensionArray();
		math.printPascalsTriangle(3);

	}
}
