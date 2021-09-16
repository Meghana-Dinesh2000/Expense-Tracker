package in.meghana.expense.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_expenses")
@Getter
@Setter
@ToString
public class Expense {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="description")
	private String expensename;
	
	private BigDecimal amount;
	
	private String note;
	
	private Long createdAt;
	
	
	@Override
	public String toString()
	{
		return "{Id"+id+",description:"+expensename+",amount:"+amount+",note:"+note+",createdAt:"+createdAt+"}\n";
	}
}
