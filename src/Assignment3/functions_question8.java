package Assignment3;

public class functions_question8 {

	private seqStart() {
		return;
	}
	public static int maxSubsequenceSum(int[] a) {
		int maxSum = 0;

		for (int i = 0; i < a.length; i++)
			for (int j = i; j < a.length; j++) {
				int thisSum = 0;

				for (int k = i; k <= j; k++)
					thisSum += a[k];

				if (thisSum > maxSum) {
					maxSum = thisSum;
					seqStart = i;
					seqEnd = j;
				}
			}

		return maxSum;
	}

	/*
	 * O(n)^2 Quadratic maximum contiguous subsequence sum algorithm. seqStart
	 * and seqEnd represent the actual best sequence.
	 */
	
	public static int maxSubsequenceSum2(int[] a) {
		int maxSum = 0;

		for (int i = 0; i < a.length; i++) {
			int thisSum = 0;

			for (int j = i; j < a.length; j++) {
				thisSum += a[j];

				if (thisSum > maxSum) {
					maxSum = thisSum;
					seqStart = i;
					seqEnd = j;
				}
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {
	}

	/**
	 * O(n) Linear maximum contiguous subsequence sum algorithm. seqStart and
	 * seqEnd represent the actual best sequence.
	 */
	public static int maximumSubsequenceSum(int[] a) {
		int maxSum = 0;
		int thisSum = 0;

		for (int i = 0, j = 0; j < a.length; j++) {
			thisSum += a[j];

			if (thisSum > maxSum) {
				maxSum = thisSum;
				int seqStart = i;
				int seqEnd = j;
			} else if (thisSum < 0) {
				i = j + 1;
				thisSum = 0;
			}
		}
		
		return maxSum;
	}
	
	System

}
