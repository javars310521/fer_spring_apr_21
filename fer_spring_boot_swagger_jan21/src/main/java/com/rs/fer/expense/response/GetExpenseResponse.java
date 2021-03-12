package com.rs.fer.expense.response;

import java.util.Set;

import org.springframework.http.HttpStatus;

import com.rs.fer.bean.Expense;
import com.rs.fer.response.AbstractResponse;

public class GetExpenseResponse extends AbstractResponse {

	private Expense expenses;

	public GetExpenseResponse(HttpStatus status, String statusCode, String message, Set<String> errorMessages) {
		super(status, statusCode, message, errorMessages);
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
		this.errorMessages = errorMessages;
	}

	public Expense getExpenses() {
		return expenses;
	}

	public void setExpenses(Expense expenses) {
		this.expenses = expenses;
	}

	

}