package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
                  glue="org.stepdefinition",
                  plugin= {"html:target","rerun:src/test/resources/failed.txt"},
                  monochrome=true,
                  dryRun=false,
                  tags= {"~@karthi"})

public class TestRunner {

}
