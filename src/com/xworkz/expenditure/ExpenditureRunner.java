package com.xworkz.expenditure;

import com.xworkz.expenditure.constants.ExpenditurePeriod;
import com.xworkz.expenditure.dao.ExpenditureDAO;
import com.xworkz.expenditure.dto.ExpenditureDTO;

public class ExpenditureRunner {

	public static void main(String[] args) {
		
		ExpenditureDTO dto = new ExpenditureDTO();
		dto.setPersonName("Kasturi");
		dto.setSpentOn("Watch");
		dto.setAmount(1000);
		dto.setTax(3);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUARTERLY);

		ExpenditureDAO dao=new ExpenditureDAO();
		boolean create= dao.create(dto);
		System.out.println("create" + create);
		
		ExpenditureDTO dto1 = new ExpenditureDTO();
		dto.setPersonName("Shilpa");
		dto.setSpentOn("Bag");
		dto.setAmount(600);
		dto.setTax(4);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		
		ExpenditureDTO dto2 = new ExpenditureDTO();
		dto.setPersonName("Shashi");
		dto.setSpentOn("Book");
		dto.setAmount(100);
		dto.setTax(5);
		dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		
		ExpenditureDTO dto3 = new ExpenditureDTO();
		dto.setPersonName("Aishu");
		dto.setSpentOn("Dress");
		dto.setAmount(600);
		dto.setTax(5);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUARTERLY);
		
		ExpenditureDTO dto4 = new ExpenditureDTO();
		dto.setPersonName("Thanuja");
		dto.setSpentOn("Medicine");
		dto.setAmount(200);
		dto.setTax(5);
		dto.setExpenditurePeriod(ExpenditurePeriod.BI_WEEKLY);
		
		ExpenditureDTO dto5 = new ExpenditureDTO();
		dto.setPersonName("Sachin");
		dto.setSpentOn("Pen");
		dto.setAmount(100);
		dto.setTax(2);
		dto.setExpenditurePeriod(ExpenditurePeriod.BI_WEEKLY);
		
		ExpenditureDTO dto6 = new ExpenditureDTO();
		dto.setPersonName("Prithvi");
		dto.setSpentOn("Water Bottle");
		dto.setAmount(600);
		dto.setTax(3);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		
		ExpenditureDTO dto7 = new ExpenditureDTO();
		dto.setPersonName("Rahul");
		dto.setSpentOn("Charger");
		dto.setAmount(800);
		dto.setTax(4);
		dto.setExpenditurePeriod(ExpenditurePeriod.BI_YEARLY);
		
		ExpenditureDTO dto8 = new ExpenditureDTO();
		dto.setPersonName("Rakesh");
		dto.setSpentOn("Watch");
		dto.setAmount(1000);
		dto.setTax(3);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUARTERLY);
		
		ExpenditureDTO dto9 = new ExpenditureDTO();
		dto.setPersonName("Laxmi");
		dto.setSpentOn("Earphone");
		dto.setAmount(1000);
		dto.setTax(5);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		
		ExpenditureDTO dto10 = new ExpenditureDTO();
		dto.setPersonName("Soujanya");
		dto.setSpentOn("Lunch Box");
		dto.setAmount(400);
		dto.setTax(4);
		dto.setExpenditurePeriod(ExpenditurePeriod.BI_YEARLY);
		
		ExpenditureDTO dto11 = new ExpenditureDTO();
		dto.setPersonName("Akshata");
		dto.setSpentOn("Milk packet");
		dto.setAmount(24);
		dto.setTax(5);
		dto.setExpenditurePeriod(ExpenditurePeriod.DAILY);
		
		ExpenditureDTO dto12 = new ExpenditureDTO();
		dto.setPersonName("Akshaya");
		dto.setSpentOn("News Paper");
		dto.setAmount(4);
		dto.setTax(0);
		dto.setExpenditurePeriod(ExpenditurePeriod.DAILY);
		
		ExpenditureDTO dto13 = new ExpenditureDTO();
		dto.setPersonName("Abhi");
		dto.setSpentOn("Soap");
		dto.setAmount(25);
		dto.setTax(1);
		dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		
		ExpenditureDTO dto14 = new ExpenditureDTO();
		dto.setPersonName("Kavya");
		dto.setSpentOn("Shampoo Bottle");
		dto.setAmount(250);
		dto.setTax(5);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUARTERLY);
		
		ExpenditureDTO dto15 = new ExpenditureDTO();
		dto.setPersonName("Jyoti");
		dto.setSpentOn("Moisturizer");
		dto.setAmount(300);
		dto.setTax(3);
		dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		
		ExpenditureDTO dto16 = new ExpenditureDTO();
		dto.setPersonName("Jeevan");
		dto.setSpentOn("Mobile Cover");
		dto.setAmount(100);
		dto.setTax(3);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		
		ExpenditureDTO dto17 = new ExpenditureDTO();
		dto.setPersonName("Ambika");
		dto.setSpentOn("Mask");
		dto.setAmount(26);
		dto.setTax(1);
		dto.setExpenditurePeriod(ExpenditurePeriod.DAILY);
		
		ExpenditureDTO dto18 = new ExpenditureDTO();
		dto.setPersonName("Harri");
		dto.setSpentOn("Pillow");
		dto.setAmount(800);
		dto.setTax(3);
		dto.setExpenditurePeriod(ExpenditurePeriod.BI_YEARLY);
		
		ExpenditureDTO dto19 = new ExpenditureDTO();
		dto.setPersonName("Pooja");
		dto.setSpentOn("Face Wash");
		dto.setAmount(150);
		dto.setTax(3);
		dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		
		
		
		
		dao.create(dto);
		dao.create(dto1);
		dao.create(dto2);
		dao.create(dto3);
		dao.create(dto4);
		dao.create(dto5);
		dao.create(dto6);
		dao.create(dto7);
		dao.create(dto8);
		dao.create(dto9);
		dao.create(dto10);
		dao.create(dto11);
		dao.create(dto12);
		dao.create(dto13);
		dao.create(dto14);
		dao.create(dto15);
		dao.create(dto16);
		dao.create(dto17);
		dao.create(dto18);
		dao.create(dto19);
		
		
	
	}

}
