# walmart_assignment
Submission of Assignment by Walmart

This assigment is done by using the following:
a) Java as the programming language
b) Selenium Webdriver as the UI testing tool
c) Junit Framework for execution
d) Spring framework with Maven project

The entire testing is done on Chrome browser, therefore in order to run the test, the following setup is done
a) Download chromedriver from website https://code.google.com/p/selenium/wiki/ChromeDriver
b) For Mac users -  extract the .zip file and copy the chromedriver.exe file into /usr/local/bin folder location
c) then in ternminal write echo $PATH -  it should this "/usr/local/bin " included
d) Lastly confirm that the chromedriver.exe file is present in /usr/local/bin 
e) Now it is ready to execute the tests on chrome driver

The steps of the testing include:
1) Log into https://walmart.com with a userid & password
2) Search for an item -  here the keyword is toy (mentioned in the assessment sheet)
3) Select any item from the serach result
4) Add the item to the cart
5) Verify that the cart has the added item and the number of the item.

