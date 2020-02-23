package de.ing.excelreader.batch;

import org.springframework.batch.core.annotation.AfterChunk;
import org.springframework.batch.item.ResourceAware;
import org.springframework.core.io.Resource;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
				+ "]";
	}
    
    

		
	
}