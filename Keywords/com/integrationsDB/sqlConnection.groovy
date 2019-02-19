package com.integrationsDB

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Driver;

import internal.GlobalVariable

public class sqlConnection {
	private static Connection connection = null;

	@Keyword
	def connectDB(String server, String port, String dbname, String username, String password){
		String address = "jdbc:sqlserver://" + server + ":" + port + ";databaseName=" + dbname + ";user=" + username + ";password=" + password

		if(connection != null && !connection.isClosed()){
			connection.close()
		}

		connection = DriverManager.getConnection(address)
		return connection
	}

	@Keyword
	def executeQuery(String queryString) {
		Statement stm = connection.createStatement()
		ResultSet rs = stm.executeQuery(queryString)
		return rs
	}

	@Keyword
	def closeDatabaseConnection() {
		if(connection != null && !connection.isClosed()){
			connection.close()
		}
		connection = null
	}


	@Keyword
	def executeUpdateOrInsert(String queryString) {
		Statement stm = connection.createStatement()
		boolean result = stm.executeUpdate(queryString)
		return result
	}
}


