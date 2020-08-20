package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Before
    public void setUp() throws Exception {
        User user1= new User("Alice", "nitin.123048@gmail.com", "123456789");
        //save user, verify has ID value after save
        //assertNull(user1.getId());
        this.userRepository.save(user1);
        //assertNotNull(user1.getId());
    }
    @Test
    public void testFetchData(){
        /*Test data retrieval*/
//        User userA = userRepository.findByName("nitin");
//        assertNull(userA);
//
//        User userB = userRepository.findByName("Alice");
//        assertNotNull(userB);
//
//        /*Get all products, list should only have two*/
//        Iterable users = userRepository.findAll();
//        int count = 0;
//        for(User p : users){
//            count++;
//        }
//        assertEquals(count, 2);
    }
}