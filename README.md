## 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술

* 2022-10-24

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


* 2022-10-27

  Lombok Library
  - @Getter & @Setter
  - build.gradle
    - dependencies 및 configurations 추가

  Bean Register
  - branch : main (Using Annotation)
  - branch : Register_Bean_Directly (Using Java)

  H2(DB)
  - jdbc:h2:~/test (최초 한번 접속)
  - 이후 jdbc:h2:tcp://localhost/~/test 로 접속
    * GITBASH 로 test.mv.db 확인 가능

# --------- Tips ------------
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

## Automatic completion(;)
    - Ctrl + Shift + Enter 

## Automatic System.out.println()
    - soutv 

## Automatic Rename
    - Shift + F6 > Rename code occurrences 

## Automatic Return
    - Ctrl + Alt + V 

## Automatic Method Extract
    - Ctrl + Alt + M

## Automatic Test File Create
    - Ctrl + Shfit + T

## Recently View File
    - Ctrl + E

## Code Combine (Inline)
    - Ctrl + ALT + N
