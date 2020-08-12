package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonDropdown extends TestBase {

    /*   Go to https://www.amazon.com/
       Find the element of the dropdown element. HINT: By.id("searchDropdownBox")
       Print the first selected option and assert if it equals “All Departments”
       Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method)
       Print all of the dropdown options
       Print the number of elements in the dropdown.size()
       BONUS : Check if Appliances is a drop down option. Print true if “Appliances” is an option.
        Print false otherwise.
       Homework: Check if the amazon dropdown is in alphabetical order
       print true if it is in alphabetical order
       print false if it not in in alphabetical order
   */

    @Test
    public void amazonTest() {
        driver.get("https://www.amazon.com/");
        WebElement dropdownElement = driver.findElement(By.id("searchDropdownBox"));

        Select select = new Select(dropdownElement);
        String firstOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(firstOption, "All Departments");
        //select 4th option by index
        select.selectByIndex(3);
        String forthOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(forthOption, "Baby");
        //printing all options
        List<WebElement> allOptions = select.getOptions();
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }
        //Check if Appliances id in the dropdown. Print True if it is. Print false if it isn't
        boolean flag = false;
        for (WebElement option : allOptions) {
            if (option.getText().equals("Appliances")) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);

        List<String> alphabeticalOrderCheck = new ArrayList<String>();
        for (WebElement exChanging : allOptions) {
            alphabeticalOrderCheck.add(exChanging.getText());
        }
        System.out.println(alphabeticalOrderCheck);
//yeni sıralı list
        List<String> alphabeticalOrderCheck1 = new ArrayList<String>();
        for (String exChanging : alphabeticalOrderCheck) {
            alphabeticalOrderCheck1.add(exChanging);
        }
        System.out.println("bu yeni olan alphabeticalOrderCheck1 " + alphabeticalOrderCheck1);
//sort edelim
        Collections.sort(alphabeticalOrderCheck1);
        System.out.println("bu yeni olan alphabeticalOrderCheck1 " + alphabeticalOrderCheck1
                + "sortlu şekli");


        boolean f = false;
        List<String> originalList = new ArrayList();
        for (WebElement option : select.getOptions()) {
            originalList.add(option.getText());
        }
        List<String> newList = originalList;
        Collections.sort(newList);
        Assert.assertEquals(newList, originalList);
        f = true;
        System.out.println(f);
    }


}




