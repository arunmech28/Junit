package com.arun.test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestLogic {

	@Test
	public void testFindMax() throws IOException {
		ExcelReader excelReader = new ExcelReader(
				"C:\\Arun\\Personal\\RestApi\\JunitPractice\\src\\com\\arun\\test\\testdata.xlsx");
		assertEquals(4, Calculation.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, Calculation.findMax(new int[] { -12, -1, -3, -4, -2 }));
		runData(excelReader);
	}

	private void runData(ExcelReader excelReader) {
		System.out.println(excelReader.getNoOfRows());
		System.out.println(excelReader.getNoOfCols());

		for (int i = 1; i < excelReader.getNoOfRows(); i++) {
			List<String> val = new ArrayList<String>();
			for (int j = 0; j < excelReader.getNoOfCols() - 1; j++) {
				val.add(excelReader.getCellData(i, j));
			}
			assertEquals(excelReader.getCellData(i, 4),
					new User(val.get(0), val.get(1), val.get(2), val.get(3)).isValid());
		}

	}
}