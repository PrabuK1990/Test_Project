import org.openqa.selenium.By;

public class NaukriHomePageSublinksReusables extends ProjectReusables implements HomePageSublink_Controls
{
		
	//Click for Search jobs
	public void HomePageJobsSearchJobs()
	{
		naukri.findElement(By.xpath(HomePageJobsSublinkControls_SearchJobs)).click();
	}
		
	public void HomePageJobsAdvancedSearch()
	{
	naukri.findElement(By.xpath(HomePageJobsSublinkControls_AdvancedSearch)).click();
	}
			
	public void HomePageJobsCreateFreeJobAlert()
	{	
		naukri.findElement(By.xpath(HomePageJobsSublinkControls_CreateFreeJobAlert)).click();
	}
	
	public void HomePageJobsRegisterNow()
	{
		naukri.findElement(By.xpath(HomePageJobsSublinkControls_RegisterNow)).click();
	}
	
	public void homepageRecruitersBrowseAllRecruiter()
	{
			naukri.findElement(By.xpath(HomePageRecruitersSublinkControls_BrowseAllRecruiters)).click();
	}
	
	public void homepageRecruitersRecruiterConnection()
	{		naukri.findElement(By.xpath(HomePageRecruitersJobsSublinkControls_RecruiterConnection)).click();
	}
	
	public void homepageRecruitersGoToNaukriRecruiter()
	{		naukri.findElement(By.xpath(HomePageRecruitersJobsSublinkControls_GoToNaukriRecruiter)).click();
	}
	
	public void homepageCompaniesBrowseAllCompanies()
	{
naukri.findElement(By.xpath(HomePageCompaniesJobsSublinkControls_BrowseAllCompanies)).click();
	}
								
	public void homepageCompaniesAboutCompanies()
	{
			naukri.findElement(By.xpath(HomePageCompaniesJobsSublinkControls_AboutCompanies)).click();
	}
		
	public void homepageCompaniesInterviewQuestions()
	{
	naukri.findElement(By.xpath(HomePageCompaniesJobsSublinkControls_InterviewQuestions)).click();
	}
	
	public void homepageCompaniesWriteCompanyReview()
	{
			naukri.findElement(By.xpath(HomePageCompaniesJobsSublinkControls_WriteCompanyReview)).click();		}
	
	public void homepageCompaniesWriteCompanyAdvise()
	{		
		naukri.findElement(By.xpath(HomePageCompaniesSublinkControls_WriteCompanyAdvise)).click();
	}
	
	public void homepageCompaniesCompanyReviews()
	{
		naukri.findElement(By.xpath(HomePageCompaniesSublinkControls_CompanyReviews)).click();
	}
	
	public void homepageToolsSalaryTrends()
	{
		naukri.findElement(By.xpath(HomePageToolsSublinkControls_SalaryTrends)).click();
	}
	
	public void homepageToolsCarrierNavigator()
	{
			naukri.findElement(By.xpath(HomePageToolsSublinkControls_CarrierNavigator)).click();
	}
	public void homepageToolsPeopleFlow()
	{
			naukri.findElement(By.xpath(HomePageToolsSublinkControls_PeopleFlow )).click();
	}
		
	public void homepageToolsTalentMigration()
	{
			naukri.findElement(By.xpath(HomePageToolsSublinkControls_TalentMigration)).click();
	}
	
	public void homepageToolsSalaryPrediction()
	{
			naukri.findElement(By.xpath(HomePageToolsSublinkControls_SalaryPrediction)).click();
	}
	
	public void homepageToolsFindMyAlumini()
	{
			naukri.findElement(By.xpath(HomePageToolsSublinkControls_FindMyAlumini)).click();
	}
	public void homepageToolsCarrierTrajectory()
	{
			naukri.findElement(By.xpath(HomePageToolsSublinkControls_CarrierTrajectory)).click();
	}

	public void homepageToolsBoomerang()
	{
			naukri.findElement(By.xpath(HomePageToolsSublinkControls_Boomerang )).click();
	}
	
	public void homepageServicesResumeWriting()
	{
			naukri.findElement(By.xpath(HomePageServicesSublinkControls_ResumeWriting)).click();
	}
	
	public void homepageServicesRecruiterReach()
	{
			naukri.findElement(By.xpath(HomePageServicesSublinkControls_RecruiterReach)).click();
	}
	
	public void homepageServicesResumeWritingCoursesCertifications()
	{
			naukri.findElement(By.xpath(HomePageServicesSublinkControls_ResumeWritingCoursesCertifications)).click();
	}
		
	public void homepageMoreCareerTools()
	{
			naukri.findElement(By.xpath(HomePageMoreSublinkControls_CareerTools)).click();
	}
	public void homepageMoreTopCoursesAndColleges()
	{
			naukri.findElement(By.xpath(HomePageMoreSublinkControls_TopCoursesAndColleges)).click();
	}
	
	public void homepageMoreTopExams()
	{
			naukri.findElement(By.xpath(HomePageMoreSublinkControls_TopExams)).click();
	}
}
