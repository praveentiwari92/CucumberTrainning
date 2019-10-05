$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/eclipse-workspace/FreeCRMBDDFramwork/src/main/java/Features/MapContact.feature");
formatter.feature({
  "line": 1,
  "name": "Contatc form submition Feature",
  "description": "",
  "id": "contatc-form-submition-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Contact form submition test",
  "description": "",
  "id": "contatc-form-submition-feature;contact-form-submition-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter contact details",
  "rows": [
    {
      "cells": [
        "username",
        "mailId",
        "mobileNo",
        "message"
      ],
      "line": 6
    },
    {
      "cells": [
        "tester",
        "test@gmail.com",
        "2323232323",
        "test"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MapContactDefination.user_is_already_on_contact_page()"
});
formatter.result({
  "duration": 7801550900,
  "status": "passed"
});
formatter.match({
  "location": "MapContactDefination.user_enter_contact_details(DataTable)"
});
formatter.result({
  "duration": 260212500,
  "status": "passed"
});
formatter.match({
  "location": "MapContactDefination.user_click_on_submit_button()"
});
formatter.result({
  "duration": 341492300,
  "status": "passed"
});
formatter.match({
  "location": "MapContactDefination.close_browser()"
});
formatter.result({
  "duration": 883129900,
  "status": "passed"
});
});