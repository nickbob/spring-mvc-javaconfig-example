# The skeleton of Spring MVC + Thymeleaf Application

### Spring modules 

```
spring-core
spring-context
spring-web
spring-webmvc
thymeleaf-spring5
javax.servlet-api
```


### Spring configuration
```
src/main/java/ru/nickbob/config/AppConfig.java - Spring MVC java configuration 
src/main/java/ru/nickbob/config/DispatcherServlet.java - Java configuration of web.xmln
```


### Annotation that are used
```
@Configuration	
@EnableWebMvc
@ComponentScan
@PropertySource
@Autowired
@Bean
@GetMapping
@PostMapping
@Value
@Controller
@ModelAttribute
@Override
```


### How to run 
```
$> mvn clean compile package tomcat7:run
```

