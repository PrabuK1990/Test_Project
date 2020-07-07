import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadExcel {
	
	public static String NaukriInputs_Url;
	public static String NaukriInputs_UserName;
	public static String NaukriInputs_Password;
	
	public static String RegisterPageControls_Name;
	public static String RegisterPageControls_EmailTextBox;
	public static String RegisterPageControls_Password;
	public static String RegisterPageControls_EnterMobileNumber;
	public static String RegisterPageControls_TotalExp;
	public static String HomePageInputs_ExpecEmailErrorMessage;
	public static String HomePageInputs_ExpecPasswordErrorMessage;
	public static String HomePageInputs_ExpecCombinedErrorMessage;


	public void loadExcelFile() throws IOException {
		
		FileInputStream file = new FileInputStream(new File("src/main/resources/Excel/Inputs.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheetNaukri = workbook.getSheetAt(0);
		
		Row row1 = sheetNaukri.getRow(1);
		
		NaukriInputs_Url = row1.getCell(0).getStringCellValue();
		System.out.println(NaukriInputs_Url);
		
		NaukriInputs_UserName = row1.getCell(1).getStringCellValue();
		System.out.println(NaukriInputs_UserName);
		
		NaukriInputs_Password = row1.getCell(2).getStringCellValue();
		System.out.println(NaukriInputs_Password);
		
		RegisterPageControls_Name = row1.getCell(3).getStringCellValue();
		System.out.println(RegisterPageControls_Name);
		
		RegisterPageControls_EmailTextBox = row1.getCell(4).getStringCellValue();
		System.out.println(RegisterPageControls_EmailTextBox);
		
		RegisterPageControls_Password = row1.getCell(5).getStringCellValue();
		System.out.println(RegisterPageControls_Password);
		
		RegisterPageControls_EnterMobileNumber = row1.getCell(6).getStringCellValue();
		System.out.println(RegisterPageControls_EnterMobileNumber);
		
		RegisterPageControls_TotalExp = row1.getCell(7).getStringCellValue();
		System.out.println(RegisterPageControls_TotalExp);
		
		HomePageInputs_ExpecEmailErrorMessage = row1.getCell(8).getStringCellValue();
		System.out.println(HomePageInputs_ExpecEmailErrorMessage);
		
		HomePageInputs_ExpecPasswordErrorMessage = row1.getCell(9).getStringCellValue();
		System.out.println(HomePageInputs_ExpecPasswordErrorMessage);
		
		HomePageInputs_ExpecCombinedErrorMessage = row1.getCell(10).getStringCellValue();
		System.out.println(HomePageInputs_ExpecCombinedErrorMessage);
		
	}

}
