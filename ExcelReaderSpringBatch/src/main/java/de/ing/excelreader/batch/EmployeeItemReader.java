package de.ing.excelreader.batch;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class EmployeeItemReader extends FlatFileItemReader<Employee> {

	public EmployeeItemReader() {
	
		
		setResource(new FileSystemResource("src/main/resources/employees.csv"));
		DefaultLineMapper<Employee> defaultLineMapper = new DefaultLineMapper<>();
		DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
		delimitedLineTokenizer.setNames(new String[] { "firstName", "lastName", "age", "salary" });

		BeanWrapperFieldSetMapper<Employee> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Employee.class);

		defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
		defaultLineMapper.setFieldSetMapper(fieldSetMapper);
		setLineMapper(defaultLineMapper);

	}

	

}
