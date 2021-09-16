package in.meghana.expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.meghana.expense.model.Expense;
import in.meghana.expense.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}

	@Override
	public void save(Expense expense) {
		expense.setCreatedAt(System.currentTimeMillis());
		expenseRepository.save(expense);
	}
	@Override
	public Expense findById(Long id)
	{
		if(expenseRepository.findById(id).isPresent())
		{
			return expenseRepository.findById(id).get();
		}
		return null;
	}
	@Override
	public void delete(Long id)
	{
		Expense expense= findById(id);
		expenseRepository.delete(expense);
		
	}

}
