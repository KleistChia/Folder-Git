# The thing learn today

1. Create REST service with SpringBoot: http://www.springboottutorial.com/creating-rest-service-with-spring-boot
	* Status: Complete (For Post)
	* Files: student-services [File is on another Folder](https://github.com/KleistChia/Folder-Git/tree/feature/Thus/Week-2/Wed/student-services)

## Problem face by creating REST Web Service with Spring Boot, Postman 

1. Problem : timestamp: 1519973633832, status: 400, error: Bad Request, exception: org.springframework.http.converter.HttpMessageNotReadableException, message: Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Void> com.in28minutes.springboot.controller.StudentController.registerStudentForCourse(java.lang.String,com.in28minutes.springboot.model.Course), path: /students/Student1/courses/
   * Solution: Need to put the JSON(Below) to the Body Tab, under raw option with the dropdown Text change to JSON(application/json)
   
   ```
   {
    "name": "Microservices", 
    "description": "10 Steps", 
    "steps": [
        "Learn How to Break Things Up", 
        "Automate the hell out of everything", 
        "Have fun"
        ]
    }
   ```
    
