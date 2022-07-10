package com.example.componentScan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentJdbcConnection {
    public ComponentJdbcConnection(){
        System.out.println("JDBC Connection");
    }
}
