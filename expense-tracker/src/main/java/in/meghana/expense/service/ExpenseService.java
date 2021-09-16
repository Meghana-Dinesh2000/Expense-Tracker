package in.meghana.expense.service;

import java.util.List;

import org.springframework.stereotype.Component;

import in.meghana.expense.model.Expense;
@Component
public interface ExpenseService {
	List<Expense> findAll();
	void save(Expense expense);
	Expense findById(Long id);
	void delete(Long id);

}
