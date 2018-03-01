# Today Lesson Learned

1. SpringBoot for Beginner: https://www.youtube.com/watch?v=PSP1-2cN7vM&list=PLBBog2r6uMCRzaJqr-uUC8gakwSxkPSBh
   * Status: Completed
   * Files: in28minute2
   * Annotation learned: @RestController, @Controller, @Autowired, @Component, @Service, @ComponentScan, @SpringBoot Application

2. Create REST service with SpringBoot: http://www.springboottutorial.com/creating-rest-service-with-spring-boot
   * Status: Half
   * Files: student-services
   * Annotation learned:
        * - [x] getMapping
        * - [ ] postMapping
        
## Problems Occur in Maven, Spring Boot

1. Problems: Failed to execute goal org.springframework.boot:spring-boot-maven-plugin:
   1.4.7.RELEASE:repackage(default) on project in28minute: Execution default of goal 
   org.springframework.boot:spring-boot-maven-plugin:1.4.7.RELEASE:repackage failed: 
   Unable to find main class
   * Solution: Create a Java Main Class in the project.
   
2. Problems: Failed to execute goal org.springframework.boot:spring-boot-maven-plugin:
   1.4.7.RELEASE:repackage(default) on project in28minute: Execution default of goal 
   org.springframework.boot:spring-boot-maven-plugin:1.4.7.RELEASE:repackage failed: 
   Unable to find a single main class from the following candidates 
   [Appllication, com.mycompany.in28minute.Application]
   * Solution: Link project.properties >> run tab >> main class to a main class file
   
3. Problems: NoSuchBeanDefinitionException
   * Reason 1: It mean Spring could not find the @Component that it nid eg:

    ```
    @AutoWired
    public WelcomeService service;
   
                //Where developer forget put @Component here which will used by the @Autowired above
    class WelcomeService {
        public String retrieveWelcomeMessage() {
            return "Good Morning~~~!this is message";
        }
    }
    ```
    * Reason 2: The @Component might put outside the package
    
    ```
    C:.
    +---springboot
        +---controller
        ¦       StudentController.java
        ¦
        +---model
        ¦       Course.java
        ¦       Student.java
        ¦
        +---service
        ¦       StudentService.java
        ¦
        +---studentservices
                StudentServicesApplication.java
    ```
    1. Where Autowired is listed under controller/StudentController.java
    2. While Component is listed under service/StudentService.java
    3. Therefore, The @ComponentScan("...[Package Path].../springboot") require put under
       * @SpringBootApplication which is listed in studentservices/StudentServicesApplication.java
       * So that, Spring are able to scan through the whole springboot folder to find the matched @Component
       
### Note:
1. Use latest spring-boot-starter-parent version instead
   * Because all dependencies inside this parent are compatible with each other
   * So is not good to change the any dependency version that are used in the parent(avoid compatibility issue)