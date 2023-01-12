package com.avdhesh.expense_tracker.Entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "expense_table")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; 
    // random id starts from 1 ......

    private String expense; 
    // which thing we bought
	
	private String description; 
    // about that expense
	
	private BigDecimal amount; 
    // cost/money we spent on that
    
}
