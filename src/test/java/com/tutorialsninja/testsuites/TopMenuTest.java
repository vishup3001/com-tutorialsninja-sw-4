package com.tutorialsninja.testsuites;

import com.tutorialsninja.pages.ComponentPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShowAllLaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();

    ShowAllLaptopsAndNotebooksPage showAllLaptopsAndNotebooksPage= new ShowAllLaptopsAndNotebooksPage();
    ComponentPage componentPage= new ComponentPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        String menuName = "Show AllDesktops";
        homePage.mouseHoverAndClickOnDesktop();
        homePage.selectMenu(menuName);
        String expectedMessage = "Desktops";
        String actualMessage = desktopPage.getDesktopText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {
        String menuName = "Show AllLaptops & Notebooks";
        homePage.mouseHoverAndClickOnLaptopAndNoteBooks();
        homePage.selectMenu(menuName);
        String expectedMessage = "Laptops & Notebooks";
        String actualMessage = showAllLaptopsAndNotebooksPage.getLaptopsAndNotebooksText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException {
        String menuName = "Show AllComponents";
        homePage.mouseHoverAndClickOnComponent();
        homePage.selectMenu(menuName);
        String expectedMessage = "Components";
        String actualMessage = componentPage.getComponentText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
