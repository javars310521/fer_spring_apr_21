package com.rs.fer.expense.util.impl;

import org.springframework.stereotype.Component;

import com.rs.fer.bean.Expense;
import com.rs.fer.expense.request.DeleteExpenseRequest;
import com.rs.fer.expense.request.EditExpenseRequest;
import com.rs.fer.expense.util.ExpenseUtil;
import com.rs.fer.util.DateUtil;

@Component
public class ExpenseUtilImpl implements ExpenseUtil {

	@Override
	public Expense loadEditExpenseRequestToExpense(EditExpenseRequest request) {

		Expense expense = new Expense();

		expense.setExpenseId(request.getExpenseId());
		expense.setType(request.getType());
		expense.setDate(request.getDate());
		expense.setPrice(request.getPrice());
		expense.setNumberOfItems(request.getNumberOfItems());
		expense.setTotal(request.getTotal());
		expense.setBywhom(request.getBywhom());

		expense.setCreated(DateUtil.getCurrentDate());

		return expense;
	}

	@Override
	public Expense loadDeleteExpenseRequestToExpense(DeleteExpenseRequest request) {

		Expense expense = new Expense();
		expense.setExpenseId(request.getExpenseid());

		return expense;
	}

}
