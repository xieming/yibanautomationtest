package com.yiban.automation.testcase;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import com.yiban.automation.pageobject.FrontPage;
import com.yiban.automation.pageobject.LoginPage;
import com.yiban.automation.pageobject.LuntanyePage;
import com.yiban.automation.pageobject.XiaoyuanactivityPage;
import com.yiban.automation.utils.WebDriverWrapper;

public class AbstractluntanTestCase extends AbstractLoginTestCase {

    public void LunTanURL() {
  /*      Student stu = students.get(mode);
      //  String schoolName = stu.getSchoolName();
        /* choose school 
        ChooseSchoolPage chooseSchoolPage = new ChooseSchoolPage(driver);
        LoginPage loginPage = chooseSchoolPage.chooseSchool(schoolName);
        assertEquals(loginPage.getSchoolNameTxt(), schoolName);
        */
        /* Login student. */

 //       String loginName = stu.getLoginName();
 //       String password = stu.getPassword();
//        LoginPage loginPage = new LoginPage(driver);
 //       ViewAssignmentPage viewAssignmentPage = loginPage.login(loginName,
//                password);

 //       /* Verify whether the school name is correct. */
 //       assertEquals(stu.getSchoolName(), viewAssignmentPage.getSchoolName());
        /* Verify whether the product name is correct. */
 //       assertEquals(stu.getProductionName().toLowerCase(), viewAssignmentPage
 //               .getProductName().toLowerCase());

        /* Launch ra web. */
  //      LibraryPage libraryPage = viewAssignmentPage
//                .startRaWeb(TestConfiguration.pageLoadWaitTime);
  //      WebDriverWrapper.waitPageLoad(driver, 15);
        /* Verify the page title. */
 //       assertEquals(libraryPage.RAPAGETITLE, libraryPage.getTitle());
 //       assertThat(libraryPage.getUrl(), containsString("raweb/ra/index.html"));
 //       if(libraryPage.isTutorialDialogPresent()){
  //          libraryPage.closeTutorial();
  //      }else{
  //          libraryPage.closePopupDialog();
 //       }
        
 //       libraryPage.exitRaweb();
    	
    	LuntanyePage luntan = new LuntanyePage(driver);
    	luntan.luntanurl ();

    }

}
