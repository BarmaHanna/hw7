package testCarHome;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;

import java.util.ArrayList;

import static helpers.Helpers.getElement;
import static helpers.Helpers.getItems;

public class CarFleaMarket {

        private final String autoCarMarket = "Автобарахолка";

        @When("Наводим на пункт Автобарахолка")
        public void enterToCarFleaMarketButton(Object aClass) {
            enterToCarFleaMarketButton(getElement(autoCarMarket));
        }

   @Then("Проверяем, что появилось подменю, отображающее категории - деление по ценам, по городам и марки")
        public void check() {
            ArrayList<String> autoItems = new ArrayList<>();
            autoItems.add("Цена с НДС");
            autoItems.add("Авто до 4000 р.");
            autoItems.add("Авто до 10 000 р.");
            autoItems.add("Минск");
            autoItems.add("Гомель");
            autoItems.add("Могилев");
            autoItems.add("Витебск");
            autoItems.add("Гродно");
            autoItems.add("Брест");
            autoItems.add("Audi");
            autoItems.add("BMW");
            autoItems.add("Citroen");
            autoItems.add("Ford");
            autoItems.add("Mazda");
            autoItems.add("Mercedes-Benz");
            autoItems.add("Nissan");
            autoItems.add("Opel");
            autoItems.add("Peugeot");
            autoItems.add("Renault");
            autoItems.add("Toyota");
            autoItems.add("Volkswagen");


       Assertions.assertThat(getItems(autoCarMarket).containsAll(autoItems)).isTrue();

    }
}
