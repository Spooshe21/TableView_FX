/********************************************************************************************
 * COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 * The reproduction, transmission or use of this document/file or its
 * contents is not permitted without written authorization.
 * Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 * Purpose:  MainController.java
 * Project:  Controller class for JavaFX application.
 * Platform: Cross-platform (Windows, macOS, Linux)
 * Compiler: JDK-22
 * IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *           Version:  2024-03 (4.31.0)
 *           Build id: 20240307-1437
 ********************************************************************************************/
package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Controller class for Main.fxml file. Initializes a TableView with student
 * data.
 */
public class MainController implements Initializable {

	@FXML
	private TableView<Student> table;
	@FXML
	private TableColumn<Student, Integer> id;
	@FXML
	private TableColumn<Student, String> name;
	@FXML
	private TableColumn<Student, String> surname;
	@FXML
	private TableColumn<Student, Integer> age;

	// ObservableList of students
	public ObservableList<Student> list = FXCollections.observableArrayList(new Student(1, "Mark", "Uzumaki", 22),
			new Student(2, "Spoorthi", "Shetty", 23), new Student(3, "Revathi", "Poojary", 21),
			new Student(4, "Sonu", "Rawal", 20), new Student(5, "Nischal", "Balraj", 20),
			new Student(6, "Shivaleela", "Desai", 28));

	/**
	 * Initializes the controller class. Sets up cell value factories for TableView
	 * columns and populates data.
	 * 
	 * @param location  The location used to resolve relative paths for the root
	 *                  object.
	 * @param resources The resources used to localize the root object.
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		id.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		surname.setCellValueFactory(new PropertyValueFactory<Student, String>("surname"));
		age.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
		table.setItems(list); // Set the items into the TableView
	}

}
