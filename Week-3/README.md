# The thing learn in this week
   
1. Testing how the Jdbc, Mysql, REST service work together
    1. Status:
        * learned how the JSON data is being sent by using jdbctemplate to obtain data from mysql
        * Postman able to received the data in JSON format
    2. Files: jdbc.mysql
   
2. Testing Jdbc with H2 In Memory 
    1. Status: 
        * Learned how to perform testing using in memory db test
        * The results status is able to display on the Netbeans output screen by using org.slf4j.Logger
        * CRUD also able to perform on it.
    2. Files:
        * initial
   
3. Configuring how Netbeans connect to Mysql through spring-boot-stater-jdbc
    1. Status: 
        * Able to used jdbc to perform Class.forname() to connect Mysql database
        * The result is tested successful with using H2(non-in-memory) for CRUD + Create table + Drop table
        * The result is also tested successful with using Mysql for CRUD + Create table + Drop table
    2. Files:
        * testing
   
4. Setting up Login page security with Spring-Security + CRUD of the college application
    1. Status: 
        * Succesfully created a simple website for login authentication using spring-security
        * understand how the .antMatchers().permitAll is used
        * understand how to use .antMatchers().hasRole() to check the login user's roles
    2. Files: 
        * authentication
   
5. Begin to develop the student enroll course Web application
    1. Status:
        a. Login page:
            * - [x] Spring-Security setup for login
            * - [ ] UI Design for login
            * - [ ] A href link for register new user and store into database
        b. Home page:
            * - [ ] Content of Home page (Not yet think what content should have)
            * - [ ] A href link for enroll courses
        c. Enroll Courses:
            * - [ ] Create for student to enroll course (Not yet decide should the form on same page or another page)
            * - [ ] A list of avaible course to enroll (will exclude the course that ald enroll by the current user)
            * - [ ] A list of course that current user has enrolled
        d. Apply for change Courses:
            * - [ ] Able to cancel courses
            * - [ ] Able to change the schedule of the enrolled course
        e. Application Status: (not yet decide name)
            * - [ ] The results of the the change application (Change schedule) and cancel application (cancel the course)
        f. Application Approval:
            * - [ ] For the lecture used, to approve on the change of schedule
        g. Admin Approval:
            * - [ ] For the Admin to approve the user to cancel application