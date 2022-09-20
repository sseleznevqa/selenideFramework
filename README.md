# selenideFramework

## What's that?
It is a framework based on Java, Gradle, Junit5, Selenide

_________

## Reports?
Allure reporting is onboard

_________

## Decisions?
- PageObject pattern
- Selenide style Pageobjects (logic inside)
- One class (Goto) as PageObjects library
- 1 File with test = 1 test
- testcases are childs of testSuites
- Less methods in Test classes
- Data for test is stored in the special class
- Parallel execution is a default (except Safari)
- Safari, Chrome, Firefox are always onboard
- More descriptions and attachs to the report

_________

## Instalation

### You need:
- MacOs or Linux
- Gradle 7.3.1 at least
- Allure (the latest preferably)
- allure should be in $PATH
- Java 17
- Chrome and Firefox (or at least one of them)
- Some luck

You can try to downgrade Java or gradle for the project. But no promises.

### You do:

```sh
git clone git@github.com:sseleznevqa/selenideFramework.git
cd selenideFramework
```

Yea. That's it.

_________

## Run tests

### You do:

```sh
gradle clean chrome
//or
gradle clean firefox
//or
gradle clean safari
//or to start chrome and firefox
gradle clean chromeFox
//or to start everything
gradle clean test
```

**Note!** clean is necessary to generate a fresh report. But it vanishes all the old reports

## Watch reports

_________

**Note!** reports are generated separately for each browser for the Greater Good

```sh
gradle chromeAllure
gradle firefoxAllure
gradle safariAllure
```

If something went terribly wrong (tests deleted the Universe, or run was without "clean") last report could be viewed as

```sh
gradle allureServe
```

Well, I hope.

_________

## Thanks for reading

I really happy that you are reading this line ;)
