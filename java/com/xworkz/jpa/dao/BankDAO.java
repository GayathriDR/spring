package com.xworkz.jpa.dao;

import com.xworkz.jpa.dto.BankEntity;

public interface BankDAO {
	public void save(BankEntity bankEntity);
	public void fetchall();

}
