package BurakBey.StepDefinition;

import BurakBey.Utilites.BaseDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void before(Scenario scenario)
    {

        System.out.println("Senaryo Başladı...");
        System.out.println(" senaryonun id si = " + scenario.getId());
        System.out.println("senaryonun adı = " + scenario.getName());

    }

    @After
    public void after(Scenario scenario)
    {
        System.out.println("Senaryo bitti");
        System.out.println("Senaryonun sonucu=" + scenario.getStatus());


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BaseDriver.quitDriver();
    }

}
