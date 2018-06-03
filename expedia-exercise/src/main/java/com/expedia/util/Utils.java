package com.expedia.util;

import java.util.Date;

/**
 *
 * @author Asma'a Taijoon
 */
public class Utils {

	public static String toString(String[] arr, String sep) {
		if (arr != null && arr.length != 0) {
			StringBuilder str = new StringBuilder();

			str.append(arr[0]);
			for (int i = 1; i < arr.length; i++) {
				str.append(sep);
				str.append(arr[i]);
			}

			return str.toString();
		}
		return "";
	}

	public static boolean isBetween(Date date, Date minDate, Date maxDate) {
		return (date.compareTo(minDate) >= 0) && (date.compareTo(maxDate) <= 0);
	}

	public static boolean isBetween(double value, double minValue, double maxValue) {
		return (Double.compare(value, minValue) >= 0) && (Double.compare(value, maxValue) <= 0);
	}

	public static String[] toStringArray(Object... values) {
		String[] arr = new String[values.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = values[i].toString();
		}

		return arr;
	}
}
