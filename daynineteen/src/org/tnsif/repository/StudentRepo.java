package org.tnsif.repository;

//program to demonstrate on CRUD Operation
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.tnsif.entities.Student;

public interface StudentRepo {
	/*
	 * The object used for executing a static SQL statement and returning the results
	 * it produces.
	 */
	Statement makeStatement();

	/*
	 * An object that represents a recompiled SQL statement.
	 */
	PreparedStatement createPrepareStatement(String query);

	public int addQuery(String query, Student student);

	public int updateQuery(String query, Student student);

	public int deleteQuery(String query);

	/*
	 * A table of data representing a database result set, which is usually generated
	 * by executing a statement that queries the database.
	 */
	public ResultSet retriveQuery(String query);

}