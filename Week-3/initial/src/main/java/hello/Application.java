/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package hello;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author UF-ChaiWaiBin
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
    
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
    
    @Autowired
            JdbcTemplate jdbcTemplate;
    
    @Override
    public void run(String... args) throws Exception {
        
        log.info("Creating tables");
        
        //drop the existing table name customers if exist
        //jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
        
        //create new table
        jdbcTemplate.execute("CREATE TABLE customers(" +
                "id SERIAL, first_Name VARCHAR(255), last_name VARCHAR(255))");
        
        //create a set of object for inserting into the database
        List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean",
                "Kleist Chia", "Josh Long").stream().map(name -> name.split(" "))
                .collect(Collectors.toList());
        
        //putting current progress into log display for each name
        splitUpNames.forEach(name -> log.info(String.format("Inserting Customer"
                + " record for %s %s...", name[0], name[1])));
        
        //batch update use to insert new records
        //? is use for avoid sql injection attacks
        jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name"
                + ") VALUES (?,?)", splitUpNames);
        
        //Begining of Self Testing
        //Update part
        String[] nameChange = { "John", "Hello"};
        
        log.info(String.format("Insertion is complated. Now begin to update!"));
        
        //When want to update value nid to use jdbcTemplate.update
        jdbcTemplate.update("UPDATE customers SET last_name = ? WHERE first_name"
                + " = ?", nameChange[1], nameChange[0]);
        
        log.info(String.format("Updating Customer record for %s %s...",
                nameChange[0], nameChange[1]));
        //End of Update part
        //Delete part
        log.info(String.format("Update is complated. Now begin to delete!"));
        
        String first_name = "Jeff";
        
        jdbcTemplate.update("DELETE from customers WHERE first_name = ?", first_name);
        //ENd of Delete part
        //End of Self Testing
        
        log.info(String.format("Delete is complated. Now begin to quuery some records6!"));
        
        //display current progress in log entries
        log.info("Querying for customer records where first_name = 'John':");
        
        /*here use to query our a search record where first_name = new Object[]
        *{<any first_name here>}
        * after -> is the part that use to get records values
        */
        jdbcTemplate.query("SELECT id, first_name, last_name FROM customers"
                + " WHERE first_name = ?", new Object[] { "John" },(rs, rowNum)
                        -> new Customer(rs.getLong("id"), rs.getString("first_name"),
                                rs.getString("last_name"))).forEach(customer -> log.info(
                                        customer.toString()));
        
        log.info("Querying for customer records where first_name = 'Jeff':");
        
        jdbcTemplate.query("SELECT id, first_name, last_name FROM customers"
                + " WHERE first_name = ?", new Object[] { "Jeff" },(rs, rowNum)
                        -> new Customer(rs.getLong("id"), rs.getString("first_name"),
                                rs.getString("last_name"))).forEach(customer -> log.info(
                                        customer.toString()));
    }
    
}
