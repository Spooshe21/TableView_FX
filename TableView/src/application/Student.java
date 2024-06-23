/********************************************************************************************
 * COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 * The reproduction, transmission or use of this document/file or its
 * contents is not permitted without written authorization.
 * Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 * Purpose:  Student.java
 * Project:  JavaFX application to display data in Table.
 * Platform: Cross-platform (Windows, macOS, Linux)
 * Compiler: JDK-22
 * IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 * Version:  2024-03 (4.31.0)
 * Build id: 20240307-1437
 ********************************************************************************************/
package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Represents a Student with properties using JavaFX properties.
 */
public class Student {
	private final SimpleIntegerProperty id;
	private final SimpleStringProperty name;
	private final SimpleStringProperty surname;
	private final SimpleIntegerProperty age;

	/**
	 * Constructor to initialize Student properties.
	 * 
	 * @param id      The ID of the student.
	 * @param name    The name of the student.
	 * @param surname The surname of the student.
	 * @param age     The age of the student.
	 */
	public Student(Integer id, String name, String surname, Integer age) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.name = new SimpleStringProperty(name);
		this.surname = new SimpleStringProperty(surname);
		this.age = new SimpleIntegerProperty(age);
	}

	/**
	 * Getter for student ID.
	 * 
	 * @return The ID of the student.
	 */
	public Integer getId() {
		return id.get();
	}

	/**
	 * Getter for student name.
	 * 
	 * @return The name of the student.
	 */
	public String getName() {
		return name.get();
	}

	/**
	 * Getter for student surname.
	 * 
	 * @return The surname of the student.
	 */
	public String getSurname() {
		return surname.get();
	}

	/**
	 * Getter for student age.
	 * 
	 * @return The age of the student.
	 */
	public Integer getAge() {
		return age.get();
	}
}
