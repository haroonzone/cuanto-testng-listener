A customized TestNG listener that anyone can use to track their tests using [Cuanto](http://www.trackyourtests.com/).


## Usage ##
At the time of writing, I am using Cuanto 2.7.0
Download and setup [Cuanto](http://www.trackyourtests.com/).

Download the source from the github repository,

Do the maven command.
    mvn clean install
this would install the cuanto-testng-listener to your local maven repository.

Specify the cuanto-testng-listener to your tests. e.g. if you are using a testng.xml file to run the tests. The listener would be

<listeners>
    <listener class-name="org.pragmaticqa.listener.CuantoListener" />
</listeners>

You also need to specify following run-time arguments for Cuanto TestNG Listener.

* cuanto.url (This is required to connect to the cuanto server)
* cuanto.projectKey (This is required to add test run information to a project within cuanto)
* APP.ENV (This is an option parameter, that you can pass on if you run the tests against different environments like CI, Test or Production)


## Cuanto TestNG Listener Features ##
There are some extra features that this listener provides you out of the box such as
* Tag the test method with the group that it belongs to in the test run.
* If the description of the test method starts with DE, then it will treat the test result as a known defect and will automatically set the Reason to be Bug and will populate the Bug field with the description of the test. We have noticed this to be useful in the tests to iron out the test failures due to know defects.
* The test suite information will be shown on the test run.

## Roadmap ##
Current plans:

* Add more information to the test outcome to make the decision making more useful.
* The project is in the initial stage at the moment and I intend to enhance this further and fix any defects reported by the users.

