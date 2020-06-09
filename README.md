# The skeleton of Spring MVC + Security + Thymeleaf Application
```
spring version - 5.2.0.RELEASE
javax.servlet - 4.0.1
thymeleaf - 3.0.11.RELEASE
jetty maven plugin - 9.4.29.v20200521
```


### Spring modules 

```
spring-core
spring-context
spring-web
spring-webmvc
spring-security-core
spring-security-config
spring-security-web
thymeleaf-spring5
javax.servlet-api
```


### Spring configuration
```
src/main/java/ru/nickbob/config/AppConfig.java - Spring MVC java configuration 
src/main/java/ru/nickbob/config/DispatcherServlet.java - Java configuration of web.xmln
src/main/java/ru/nickbob/config/AppSecurityConfig.java - Java Spring Security Configuration
```


### Annotation that are used
```
@Configuration
@EnableWebMvc
@EnableWebSecurity
@ComponentScan
@PropertySource
@Autowired
@Bean
@GetMapping
@PostMapping
@Value
@Controller
@RequestParam
@ModelAttribute
@Override
```


### How to run 
```
$> mvn clean compile package jetty:run
```

