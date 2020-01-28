# Raynevun/google-search-tests
Selenium tests examples for Google Search page

## How to setup automation environment:
### Windows:
1. Install [git](https://git-scm.com/downloads)
2. Add path to `Git\cmd` to ['PATH'](https://java.com/en/download/help/path.xml) environment variable
3. Install [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
4. Create ['JAVA_HOME'](https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html) environment variable with path to Java directory
5. Install [maven](https://maven.apache.org/download.cgi)
6. Add path to `maven\bin` to ['PATH'](https://java.com/en/download/help/path.xml) environment variable
7. Clone master branch of ['Raynevun/google-search-tests'](https://github.com/Raynevun/google-search-tests) or run `git pull` to receive latest changes
8. Download webdriver for [Chrome](https://sites.google.com/a/chromium.org/chromedriver/downloads)
9. Add path to webdriver to ['PATH'](https://java.com/en/download/help/path.xml) environment variable
10. To run test in maven execute `mvn clean test` in `Raynevun/google-search-tests` folder

### MacOS:
1. Git should be pre-installed on MacOS
2. Install [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
3. Install [homebrew](http://brew.sh/)
4. Install maven `brew install maven`
5. Clone master branch of ['Raynevun/google-search-tests'](https://github.com/Raynevun/google-search-tests) and run `git pull` to receive latest changes
6. Download webdriver for [Chrome](https://sites.google.com/a/chromium.org/chromedriver/downloads)
7. Add path to webdriver to ['PATH'](https://java.com/en/download/help/path.xml) environment variable
8. To run test in maven execute `mvn clean test` in `Raynevun/google-search-tests` folder

## How to run tests in Firefox:
1. Download webdriver for [Firefox](https://github.com/mozilla/geckodriver/releases)
2. Add path to webdriver to ['PATH'](https://java.com/en/download/help/path.xml) environment variable
3. To run tests in Firefox with maven run `mvn clean test -Dbrowser=firefox`
4. To run tests in Firefox with IntelliJ IDEA add parameters to `VM options`, e.g. `-Dbrowser=firefox`

## How to run tests in Internet Explorer 11:
1. Download 32 bit webdriver for [Internet Explorer 11](http://www.seleniumhq.org/download/)
2. Add path to webdriver to ['PATH'](https://java.com/en/download/help/path.xml) environment variable
3. ~~Download and install webdriver plugin for [Internet Explorer 11](https://www.microsoft.com/en-us/download/details.aspx?id=44069)~~ should work without this step
4. ~~Open `Internet Options` in `Control Panel` click on `Security` tab and disable `Protected Mode` for all zones~~ should work without this step
5. To run tests in Internet Explorer with maven run `mvn clean test -Dbrowser=ie`
6. To run tests in Internet Explorer with IntelliJ IDEA add parameters to `VM options`, e.g. `-Dbrowser=ie`

## Reports generation
1. ExtentRepots generates report on every run in `target/reports/TestListener.html`
2. If tests failed you can find screenshots in `target/reports/screenshots`
3. To generate Allure report after `mvn clean test` run `mvn site`, you can find report in `target/site`
4. After `mvn site` you can use `mvn jetty:run` and open report in browser using `localhost:8080`

## Profiles
1. To run only smoke tests use `-PsmokeTests` when running `mvn clean test`
2. By default `mvn clean test` is running all tests `-PregressionTests`

## Additional information:
1. Parameter `-Dbrowser` isn't mandatory, default value is `chrome`, available options:
  a. `firefox` for Firefox
  b. `chrome` for Chrome
  c. `safari` for Safari
  d. `ie` for Internet Explorer 
  e. `edge` for Edge
2. Don't use 64 bit Internet Explorer webdriver, it is really slow
3. After editing 'PATH' environment variable in Windows you might need to reboot your PC
4. To run tests on Jenkins use `-Djava.awt.headless=false` parameter