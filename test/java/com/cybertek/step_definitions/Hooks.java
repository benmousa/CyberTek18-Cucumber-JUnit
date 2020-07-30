package com.cybertek.step_definitions;

import com.cybertek.utillities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUpScenario(Scenario scenario){
        System.out.println("scenario.getName() = " + scenario.getName());
    }

    @After
    public void tearDownScenario(Scenario scenario){
        System.out.println("scenario.isFailed() = " + scenario.isFailed());

        if (scenario.isFailed()){
            byte [] screenShots = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShots, "image/png", scenario.getName());
        }

    }



    /*
    @Before(order = 2)
    public void setUpScenario(){
        System.out.println("----> Before annotation: Settings up browser");
    }

    @Before(value = "@db", order = 1)
    public void setUpDatabaseConnection (){
        System.out.println("---------> Before Annotation: DB connection created <---------");
    }

    @After(order = 5)
    public void tearDownScenario(){
        System.out.println("----> After annotation: Closing browser");
    }

    @After(value = "@db", order = 4)
    public void tearDownDatabaseConnection(){
        System.out.println("---------> Before Annotation: DB connection closed <------");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("=======> beforeStep: Taking a screenShot <=======");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("=======> AfterStep: Taking a screenShot <=======");
    }
*/

}
