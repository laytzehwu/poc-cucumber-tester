Feature: Is the endpoint on?
  Check whether the endpoint is up

  Scenario: Call actuator check
    Given setup endpoint url "localhost:8080"
    Then health check pass