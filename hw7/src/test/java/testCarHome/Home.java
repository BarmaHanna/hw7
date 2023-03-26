package testCarHome;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.asynchttpclient.util.Assertions;

import java.util.ArrayList;

public class Home {

        private final String home = "Дома и квартиры";

        @When("Наводим на пункт Дома и квартиры")
        public void enterToHomeButton() {
            enterToHomeButton(getElement(home));
        }

        @Then("Проверяем, что появилось подменю, отображающее категории - города, количестов комнат, ценовой диапазон.")
        public void check() {
            ArrayList<String> homeItems = new ArrayList<>();
            homeItems.add("Минск");
            homeItems.add("Брест");
            homeItems.add("Витебск");
            homeItems.add("Гомель");
            homeItems.add("Гродно");
            homeItems.add("Могилев");
            homeItems.add("1-комнатные");
            homeItems.add("2-комнатные");
            homeItems.add("3-комнатные");
            homeItems.add("4+-комнатные");
            homeItems.add("До 30 000 $");
            homeItems.add("30 000–80 000 $");
            homeItems.add("От 80 000 $");

            Assertions.assertThat(getItems(homeItems).containsAll(homeItems)).isTrue();


        }
    }


