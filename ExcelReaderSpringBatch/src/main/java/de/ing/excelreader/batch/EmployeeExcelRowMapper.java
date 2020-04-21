package de.ing.excelreader.batch;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class EmployeeExcelRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(RowSet rowSet) throws Exception {
		Employee employee = new Employee();

		employee.setFirstName(rowSet.getColumnValue(0));
		employee.setLastName(rowSet.getColumnValue(1));
		

		return employee;
	}
}
