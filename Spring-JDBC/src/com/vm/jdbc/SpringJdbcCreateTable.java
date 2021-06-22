package com.vm.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcCreateTable
{
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt)
	{
		this.jt = jt;
	}

	public void createTable()
	{
		jt.execute("create table sptest(sno int, sname varchar(10))");
		// execute() returns void
		System.out.println("table created");
	}
}