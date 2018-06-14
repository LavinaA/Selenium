$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027stepdef2/routine2.feature\u0027");
formatter.feature({
  "line": 1,
  "name": "Life of king",
  "description": "\nIn order to go office\nAs a working guy\nI want to wish people",
  "id": "life-of-king",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 16,
  "name": "I am an Employee and his attitude",
  "description": "",
  "id": "life-of-king;i-am-an-employee-and-his-attitude;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@tester"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "we work in \"tenpm\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "we meet \"watchmen\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I skipGreeting him",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "tenpm",
      "offset": 12
    }
  ],
  "location": "AtitudeTest2.we_work_in(String)"
});
formatter.result({
  "duration": 463511437,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "skipGreeting",
      "offset": 2
    }
  ],
  "location": "AtitudeTest2.gre(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 17,
  "name": "I am an Employee and his attitude",
  "description": "",
  "id": "life-of-king;i-am-an-employee-and-his-attitude;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@tester"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "we work in \"ninepm\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "we meet \"cabdriver\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I skipGreeting him",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ninepm",
      "offset": 12
    }
  ],
  "location": "AtitudeTest2.we_work_in(String)"
});
formatter.result({
  "duration": 384779,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "skipGreeting",
      "offset": 2
    }
  ],
  "location": "AtitudeTest2.gre(String)"
});
formatter.result({
  "status": "skipped"
});
});