package spring_component_scan_example;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Person {
    @Getter 
    @Autowired
    private City city;

    @Getter 
    @Autowired
    private Wife wife;
    
    @Getter
    @Autowired
    private Career career;
    
}