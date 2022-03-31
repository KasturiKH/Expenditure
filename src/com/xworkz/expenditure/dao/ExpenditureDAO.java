package com.xworkz.expenditure.dao;

import com.xworkz.expenditure.dto.ExpenditureDTO;

public class ExpenditureDAO {
	
	private ExpenditureDTO[] expenditureDTO= new ExpenditureDTO[20];
	private int expenditureIndex = 0;
	
	public ExpenditureDAO() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	public boolean create(ExpenditureDTO dto)
	{
		System.out.println("invoke create expenditure".concat(dto.toString()));
		if(expenditureIndex <this.expenditureDTO.length)
		{
			this.expenditureDTO[expenditureIndex] = dto;
			expenditureIndex++;
			System.out.println("expenditure added 0" + this.expenditureIndex);
		return true;
		}
		else
		{
			System.out.println("expenditure cannot added, index is full");
		}
		return false;
	}

}
