# Spring Cloud + AWS SSM integration

Application demonstrates problem in Spring Cloud implementation of integration 
with AWS SSM integration. Changes in existing SSM values are not reflected in 
application that is running with `spring.cloud.aws.parameterstore.reload.strategy=refresh` 
strategy.

Spring Cloud detects changes in SSM parameter `/config/message` however method `com.example.demo.MyConfig.setMessage(String)` 
is called with old value.