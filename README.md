# Project test for Behavior Driven Development with Cucumber
1. Create a folder (named Checkout, for instance) 
2. Inside "Checkout", create another folder named "jars"
3. Inside "jars", download the latest version of the following dependencies:
	- ci-environment-9.1.0.jar
	- cucumber-core-7.11.0.jar
	- cucumber-gherkin-7.11.0.jar
 	- cucumber-java-7.11.0.jar
 	- cucumber-jvm-deps-1.0.6.jar
	- cucumber-plugin-7.11.0.jar
	- gherkin-26.0.3.jar
	- messages-21.0.1.jar
	- tag-expressions-5.0.1.jar 

4. At the root of the project (inside "Checkout" folder), in order to run the project, type:
	java -cp "jars/*" io.cucumber.core.cli.Main -p pretty .

5. At the root of the project, let's create a file named "cucumber" ("cucumber.bat" on Windows), then 
   make the file executable with the following cmd: "sudo chmod u+x cucumber"
