package com.avdhesh.expense_tracker.Service.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avdhesh.expense_tracker.Entities.Expense;
import com.avdhesh.expense_tracker.Repository.ExpenseRepo;
import com.avdhesh.expense_tracker.Service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
	private ExpenseRepo expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}

	@Override
	public Expense save(Expense expense) {
		expenseRepository.save(expense);
		return expense;
	}

	@Override
	public Expense findById(Long id) {
		if(expenseRepository.findById(id).isPresent()){
			return expenseRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		Expense expense = findById(id);
		expenseRepository.delete(expense);
	}
    
}
