# spring-basic

* 2022-10-14

    Spring boot project create 
    - https://start.spring.io
    - Gradle (요즘 추세) / v2.7.5 (2022.10.24) 

    Metadata
	
        - Group (기업 도메인 명)
		
        - Artifact (빌드 될 때 나오는 결과물)
		
        - Java 11 

    Dependencies
	
        - Spring Web 
		
        - Thymeleaf (html을 만들어주는 템플릿 엔진)
        

    Setting File
	
        - build.gradle (라이브러리, 버전 설정)


## Fast Run Setting
Setting > Gradle

    - Build and run > Build and run using(Run tests using) : IntelliJ IDEA 


## HOW TO BUILD ON WINDOWS USING GITBASH?
    a. Run with gitbash administrator privileges
	
    b. ./gradlew build
	
	c. cd build/libs > hello-spring-0.0.1-SNAPSHOT.jar
	
	d. java -jar hello-spring-0.0.1-SNAPSHOT.jar
	
	
## Parameter Info
    - Ctrl + P