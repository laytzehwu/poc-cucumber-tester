# Prove of concept for Cucumber in Test Automation in Java project
Testing Automation Repository for [poc-cucumber](https://github.com/laytzehwu/poc-cucumber).

## Prerequisite
Some software are required before run the program:

1. [Java 8] - Programming language of backend

2. [Apache Maven] - Software project management and comprehension tool. We are using it to build and run our project.

3. [GIT] - Version control system

4. [IntelliJ] - IDE to do Java coding

## Include cucumber in pom.xml
Cucumber requires dependency in pom.xml:
```xml
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>2.3.1</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>2.3.1</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>
```


## Run Test

Below maven command run test:
```ssh
mvn test
```


   [Apache Maven]: https://maven.apache.org/
   [Java 8]: https://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html
   [GIT]: https://git-scm.com/
   [IntelliJ]: https://www.jetbrains.com/idea/

