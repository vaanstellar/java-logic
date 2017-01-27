package com.van.javacourse;

import java.util.ArrayList;
import java.util.List;

public final class Gaussian {
	protected static double stdDeviation, variance, mean;

	public static void main(String... aArgs) {
		variance = 1000;
		mean = 0;
		stdDeviation = 1;
		System.out.println("Y = "+ getThruster(20));
		List<int[]> pos = new ArrayList<int[]>();
	}

	static double variance(double[] population) {
		long n = 0;
		double mean = 0;
		double s = 0.0;

		for (double x : population) {
			n++;
			double delta = x - mean;
			mean += delta / n;
			s += delta * (x - mean);
		}
		return (s / n);
	}


	public static int getThruster(int x) {
		 double t = Math.pow(Math.exp(-(((x - mean) * (x - mean)) / ((2 * variance)))),
				1 / (stdDeviation * Math.sqrt(2 * Math.PI)));
		 return  (int)(t*100);
	}

}
