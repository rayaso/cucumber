Feature:UserAuthentication

user should be able to loggin to the application with valideusername and password

Scenario:users enter valid username and valid password
user should be able to login
 Given user launches browser
 When user enters the url
 And user clicked on login link
 Then user is navigated to my account page


