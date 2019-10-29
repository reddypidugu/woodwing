# woodwing test

### REST API to Accept 2 params and add up
 This application built using Spring Boot framework.
 
 #### Logic
 
 The REST API accepts 2 parameters param1 and param2. The user has to send the request like below
 ```` 
 http://localhost:8080/api/?param1=4yards&param2=6meters

````
 
 The Controller class accepts the both the parameters as strings and does the following actions 
 * Checks the both the params are available or not, if not send the response as the Bad request.
 * If both the params available, sends the request to back-end Service class to process the request.
 
 The Service class contains the actual logic to convert and add the both values and sends the response back to Controller.
 * Checks for the units of both the values are YARDS or METERS. 
 * Extracts the numbers from the both the params, if the unit is YARDS converts the value into METERS.
 * Finally adds the both values which are in METERS unit.
 
 Utils package contains the code to extract the number/integer value from String input params and will be 
 re-used to extract the integer values the both params.
 
 ## How to run
 
 * Compile the code and build jar 
 ````
  mvn clean install
 ````
 
 * Run the application
 ````
  mvn spring-boot:run
 ```` 
 
 ## Tools/technologies used
 * Java 8
 * Spring Boot REST
 * Maven 