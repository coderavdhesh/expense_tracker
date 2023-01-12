package com.avdhesh.expense_tracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.avdhesh.expense_tracker.Entities.Expense;

// repostitory class
public interface ExpenseRepo extends JpaRepository<Expense, Long>{
    
}
