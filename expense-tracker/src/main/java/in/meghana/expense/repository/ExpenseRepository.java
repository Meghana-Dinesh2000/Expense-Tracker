package in.meghana.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import in.meghana.expense.model.Expense;

@Repository
@Component
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
