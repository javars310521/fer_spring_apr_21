package com.rs.fer.util;

import java.util.Set;

import org.springframework.util.StringUtils;

public class FERUtil {

	public static Set<String> addErrorIfEmpty(Set<String> errorMessages, String value, String errorMessage) {

		if (StringUtils.isEmpty(value)) {
			errorMessages.add(errorMessage);
		}

		return errorMessages;
	}

	public static Set<String> addErrorIfEmpty(Set<String> errorMessages, int value, String errorMessage) {

		if (StringUtils.isEmpty(value)) {
			errorMessages.add(errorMessage);
		}

		return errorMessages;
	}

	public static Set<String> addErrorIfEmpty(Set<String> errorMessages, float value, String errorMessage) {

		if (StringUtils.isEmpty(value)) {
			errorMessages.add(errorMessage);
		}

		return errorMessages;
	}

}
