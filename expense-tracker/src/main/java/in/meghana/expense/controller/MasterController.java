package in.meghana.expense.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import in.meghana.expense.model.Expense;
import java.util.List;
import in.meghana.expense.service.ExpenseService;
import lombok.Getter;

@Controller

public class MasterController {
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping(value="/")
	public ModelAndView home()
	{
		ModelAndView mov = new ModelAndView("home");
		mov.addObject("message","List of expenses");
		List<Expense> expenses= expenseService.findAll();
		mov.addObject("expenses",expenses);
		return mov;
	}
	@RequestMapping(value="/expense")
	public ModelAndView addexpense()
	{
		ModelAndView mov = new ModelAndView("expense");
		mov.addObject("expense",new Expense());
		return mov;
	}
	@RequestMapping(value="/expense",method=RequestMethod.POST)
	public String save(@ModelAttribute("expense")Expense expense)
	{
		expenseService.save(expense);
		return "redirect:/";
	}
	@RequestMapping(value="/expense/{id}")
	public ModelAndView edit(@PathVariable("id")Long id)
	{
		ModelAndView mav=new ModelAndView("expense");
		Expense expense=expenseService.findById(id);
		mav.addObject("expense",expense);
		return mav;
		
	}
	@RequestMapping(value="/expense/{id}/delete")
	public String delete(@PathVariable("id")Long id)
	{
		expenseService.delete(id);
		return "redirect:/";
		
	}
}
