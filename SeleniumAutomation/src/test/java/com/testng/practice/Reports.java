package com.testng.practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Reports {
	ExtentReports report;
	ExtentTest test;
	
	@BeforeSuite
	public void initializeReport() {
		
		 ExtentHtmlReporter spark = new ExtentHtmlReporter("ExtentReports.html");
		 report = new ExtentReports();
		 report.attachReporter(spark);
		 

	}
	
//	@Test
//	public void test() {
//		test = report.createTest("LaunchBrowser", "Browser Launching");
//		test.log(Status.PASS, "Working fine");
//	}
	
	
	@AfterSuite
	public void closeReport() {
		report.flush();
	}
}
