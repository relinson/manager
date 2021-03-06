package com.aisino.admin.companyCard.cardMaintain.dao;

import com.aisino.admin.companyCard.cardMaintain.bean.CompanyCard;
import com.aisino.admin.global.paging.Page;

import java.util.List;

public interface CompanyCardMaintainDao {
	
	public List<CompanyCard> queryPage(Page<CompanyCard> page);
	
	public int count(Page<CompanyCard> page);

	public CompanyCard queryByName(String name);

	public CompanyCard queryByTaxid(String taxid);

	public CompanyCard queryByCode(String code);

	public CompanyCard queryById(int id);

	public void update(CompanyCard card);
}
