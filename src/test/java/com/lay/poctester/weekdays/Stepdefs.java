package com.lay.poctester.weekdays;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.client.RestTemplate;

public class Stepdefs {
    public static final Logger LOGGER = LoggerFactory.getLogger(Stepdefs.class);
    private String endpointURL;


    @Given("^setup endpoint url \"([^\"]*)\"$")
    public void setup(String url) {
        LOGGER.debug("##########################################################################################");
        LOGGER.debug("Testing endpoint URL" + url);
        endpointURL = url;
    }

    @Then("^health check pass$")
    public void health_check_pass() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject(endpointURL + "/actuator");
    }
}
