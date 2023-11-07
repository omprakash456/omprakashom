Feature:  account Registration in Demo.opencart
Scenario: Register account and Get Successful message.

Given User lands in Opencart HomePage
When User clicks Register link
And User enters Gender,Firstname,Lastname,E-Mail,Password and CPassword
	
	|gender|firstname |lastname|email                  |password      |Cpassword |
	|Male  |omprakash | s      |omprakashragu1@gmail.com|Save@05081999 |Save@05081999 |

And User click register button
Then User get successfully registerd message and log out