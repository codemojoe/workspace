package com.entertainment.test;

import composition_example.Employee;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void testGetName() {
        Employee emp = new Employee("Joe", 10000);
        String toBeTested = emp.getName();
        Assert.assertEquals("Joe", toBeTested);
    }
}