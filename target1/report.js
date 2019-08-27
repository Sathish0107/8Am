$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddTariffPlan.feature");
formatter.feature({
  "name": "Add TariffPlan Functionality",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should be telecom homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffPlan.user_should_be_telecom_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to Addtariffplan page",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlan.user_should_navigate_to_Addtariffplan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add TariffPlan details with valid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@karthi"
    },
    {
      "name": "@java"
    }
  ]
});
formatter.step({
  "name": "user should enter plan detailss",
  "rows": [
    {
      "cells": [
        "100",
        "200",
        "300",
        "400",
        "1",
        "2",
        "3"
      ]
    },
    {
      "cells": [
        "200",
        "300",
        "400",
        "500",
        "2",
        "3",
        "4"
      ]
    },
    {
      "cells": [
        "300",
        "400",
        "500",
        "600",
        "3",
        "4",
        "5"
      ]
    },
    {
      "cells": [
        "400",
        "500",
        "600",
        "700",
        "4",
        "5",
        "6"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlan.user_should_enter_plan_detailss(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should submit the plan details",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlan.user_should_submit_the_plan_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not be displayed with congratulation you add tariffplan",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlan.user_should_not_be_displayed_with_congratulation_you_add_tariffplan()"
});
formatter.result({
  "status": "passed"
});
});