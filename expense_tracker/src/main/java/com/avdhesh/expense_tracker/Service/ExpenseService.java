package com.avdhesh.expense_tracker.Service;

import java.util.List;

import com.avdhesh.expense_tracker.Entities.Expense;

public interface ExpenseService {

    List<Expense> findAll();
	
	Expense save(Expense expense);
	
	Expense findById(Long id);
	
	void delete(Long id);
    
}
