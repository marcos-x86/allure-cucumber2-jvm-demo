package allure.cucumber2.jvm.demo.stepdef;

import cucumber.api.java8.En;

public class MyStepdefs implements En {

    private static final String MSG_ENTER_LOGIN_PAGE = "I enter to Google Services Login page";
    private static final String MSG_FILL_USERNAME = "I fill the username field with \"%s\"";
    private static final String MSG_FILL_PASSWORD = "I fill the password field with \"%s\"";
    private static final String MSG_CLICK_LOGIN = "I click on login button";
    private static final String MSG_VERIFY_LOGIN = "I am in the login page";

    public MyStepdefs() {
        Given("^I enter to Google Services Login page$", () -> {
            System.out.println(MSG_ENTER_LOGIN_PAGE);
        });
        When("^I fill the username field with \"([^\"]*)\"$", (final String username) -> {
            System.out.println(String.format(MSG_FILL_USERNAME, username));
        });
        When("^I fill the password field with \"([^\"]*)\"$", (final String password) -> {
            System.out.println(String.format(MSG_FILL_PASSWORD, password));
        });
        When("^I click on login button$", () -> {
            System.out.println(MSG_CLICK_LOGIN);
        });
        Then("^I am in the login page$", () -> {
            System.out.println(MSG_VERIFY_LOGIN);
        });
    }
}
