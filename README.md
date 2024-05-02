# Selenium Java Web Automation

## Check out [BongoBd.com](https://www.bongobd.com) website automation.
**TestCase 01: (Drama & Sports Test)**
_Test-1_ 
1. Go to BongoBd.com URL 
2. From menu bar click Drama
3. Search 420 
4. From 420 drama list ,play 1st drama.
5. Unit Testing Done.

_Test-2_
1. Go to BongoBd.com URL
2. From menu bar click Sports
3. Search messi
4. From list, play 3rd news, pause & play.
5. Check Unit Testing.

**TestCase 02: (Movie Test)**
_Test-1_
1. Go to BongoBd.com URL
2. From menu bar click Music
3. Scroll Down & go to latest music.
4. Play 4th movie.
5. Check Unit Testing.

**TestCase 03: (Movie Test)**
_Test-1_
1. Go to BongoBd.com URL
2. From menu bar click Movies
3. Scroll Down & go to tribute to salman shah.
4. Play 1st movie.
5. Check Unit Testing.

This project using the following languages and frameworks:

* [Java 11](https://openjdk.java.net/projects/jdk/11/) as the programming language
* [TestNG](https://testng.org/doc/) as the UnitTest framework to support the test creation
* [Selenium WebDriver](https://www.selenium.dev/) as the web browser automation framework using the Java binding


## Test architecture

We know that any automation project starting with a good test architecture.
This project can be your initial test architecture for a faster start.
You will see the following items in this architecture:

* [Page Objects pattern](#page-objects-pattern)
* [Execution types](#execution-types)
* [BaseTest](#basetest)
* [Configuration files](#configuration-files)
* [Profiles executors on pom.xml](#profiles-executors-on-pomxml)
* [Pipeline as a code](#pipeline-as-a-code)
* Video Play and Pause automation


Do you have any other items to add to this test architecture? Please do a pull request or open an issue to discuss.

### Page Objects pattern
I will not explain the Page Object pattern because you can find a lot of good explanations and examples on the internet.
Instead, I will explain what exactly about page objects I'm using in this project.

#### AbstractPageObject
This class has a protected constructor to remove the necessity to init the elements using the Page Factory.
Also, it sets the timeout from the `timeout` property value located on `general.properties` file.

All the Page Object classes should extend the `AbstractPageObject`.
It also tries to remove the `driver` object from the Page Object class as much as possible.



