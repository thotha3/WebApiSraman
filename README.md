#WebApiSraman

This projects contains 2 parts:
    - API Tests
    - Web UI Tests

Test scenarios:
    - API
        - Positive scenario with result validation
        - Negative scenario with result validation
    - Web UI
        - End-to-end scenario with result validation

How to run the tests: mvn clean test -Dsurefire.suiteXmlFiles=testng.xml