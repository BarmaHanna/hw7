$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hw7.feature");
formatter.feature({
  "line": 1,
  "name": "Домашнее задание №7",
  "description": "",
  "id": "домашнее-задание-№7",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Я нахожусь на главной странице сайта",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Открываем сайт \"https://www.onliner.by/\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 6,
  "name": "Сценарий №1",
  "description": "",
  "id": "домашнее-задание-№7;сценарий-№1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Наводим на пункт Автобарахолка",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Проверяем, что появилось подменю, отображающее категории - деление по ценам, по городам и марки",
  "keyword": "Then "
});
formatter.match({
  "location": "CarFleaMarket.enterToCarFleaMarketButton(Object)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CarFleaMarket.check()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "Я нахожусь на главной странице сайта",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Открываем сайт \"https://www.onliner.by/\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "Сценарий №2",
  "description": "",
  "id": "домашнее-задание-№7;сценарий-№2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Наводим на пункт Дома и квартиры",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Проверяем, что появилось подменю, отображающее категории - города, количестов комнат, ценовой диапазон.",
  "keyword": "Then "
});
formatter.match({
  "location": "Home.enterToHomeButton(SelenideElement)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Home.check()"
});
formatter.result({
  "status": "skipped"
});
});