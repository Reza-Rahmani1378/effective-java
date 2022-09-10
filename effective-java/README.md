# Effective java 
A personal practice to cover Effective java  Based on [this](https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997) book

![image](https://images-na.ssl-images-amazon.com/images/I/41zLisPNN2L._SX376_BO1,204,203,200_.jpg)

## Table of Contents
1. [Creating and Destroying Objects](#create_distroy)
2. [Methods Common to All Objects](#methods_common)
3. [Classes and Interfaces](#classes_interfaces)
4. [Generics](#generics)
5. [Enums and Annotations](#enums_annotations)
6. [Lambdas and Streams](#lambdas_streams)
7. [Methods](#methos)
8. [General Programming](#general_programming)
9. [Exceptions](#exceptions)
10. [Concurrency](#concurrency)
11. [Serialization](#serialization)

## Contents to cover in detail
### 1. Creating and Destroying Objects <a name="create_distroy"></a>
- [x] Item 1: Consider static factory methods instead of constructors
- [x] Item 2: Consider a builder when faced with many constructor parameters
- [x] Item 3: Enforce the singleton property with a private constructor or an enum typ
- [x] Item 4: Enforce noninstantiability with a private constructor
- [x] Item 5: Prefer dependency injection to hardwiring resources
- [x] Item 6: Avoid creating unnecessary objects
- [x] Item 7: Eliminate obsolete object references
- [x] Item 8: Avoid finalizers and cleaners
- [x] Item 9: Prefer try-with-resources to try-finally
### 2. Methods Common to All Objects <a name="methods_common"></a>
- [x] Item 10: Obey the general contract when overriding equals
- [x] Item 11: Always override hashCode when you override equals
- [x] Item 12: Always override toString
- [x] Item 13: Override clone judiciously
- [x] Item 14: Consider implementing Comparable
### 3. Classes and Interfaces <a name="classes_interfaces"></a>
- [ ] Item 15: Minimize the accessibility of classes and members
- [ ] Item 16: In public classes, use accessor methods, not public fields
- [ ] Item 17: Minimize mutability
- [ ] Item 18: Favor composition over inheritance
- [ ] Item 19: Design and document for inheritance or else prohibit it
- [ ] Item 20: Prefer interfaces to abstract classes
- [ ] Item 21: Design interfaces for posterity
- [ ] Item 22: Use interfaces only to define types
- [ ] Item 23: Prefer class hierarchies to tagged classes
- [ ] Item 24: Favor static member classes over nonstatic
- [ ] Item 25: Limit source files to a single top-level class
### 4. Dealing with passwords  <a name="dealing_with_passwords"></a>
- [ ] Understanding the PasswordEncoder contract 
- [ ] More about the Spring Security Crypto module 
### 5. Implementing authentication  <a name="implementing_authentication"></a>
- [ ] Understanding the AuthenticationProvider
- [ ] Using the SecurityContext
- [ ] Understanding HTTP Basic and form-based login authentications 
### 6. Hands-on:A small secured web application <a name="secured_web"></a>
- [ ] Project requirements and setup
- [ ] Implementing user management 
- [ ] Implementing custom authentication logic
- [ ] Implementing the main page 
- [ ] Running and testing the application 
### 7. Configuring authorization: Restricting access <a name="config_authorization"></a>
- [ ] Restricting access based on authorities and roles
### 8. Configuring authorization: Applying restrictions <a name="config_authorization_applying"></a>
- [ ] Using matcher methods to select endpoints 
- [ ] Selecting requests for authorization using MVC matchers 
- [ ] Selecting requests for authorization using Ant matchers
- [ ] Selecting requests for authorization using regex matchers 
### 9. Implementing filters <a name="filters"></a>
- [ ] Implementing filters in the Spring Security architecture 
- [ ] Adding a filter before an existing one in the chain 
- [ ] Adding a filter after an existing one in the chain 
- [ ] Adding a filter at the location of another in the chain 
- [ ] Filter implementations provided by Spring Security 
### 10. Applying CSRF protection and CORS <a name="CSRF_CORS"></a>
- [ ] Applying cross-site request forgery (CSRF) protection in applications  
- [ ] Using cross-origin resource sharing 
### 11. Hands on: A separation of responsibilities <a name="separation"></a>
- [ ] The scenario and requirements of the example 
- [ ] Implementing and using tokens 
- [ ] Implementing the authentication server 
- [ ] Implementing the business logic server
### 12. How does OAuth2 work? <a name="oauth"></a>
- [ ] The OAuth 2 framework 
- [ ] The components of the OAuth 2 authentication architecture
- [ ] Implementation choices with OAuth 2
- [ ] The sins of OAuth 2
- [ ] Implementing a simple single sign-on application
### 13. OAuth2: Implementing the authorization server <a name="authorization_server"></a>
- [ ] Writing your own authorization server implementation
- [ ] Defining user management 
- [ ] Registering clients with the authorization server 
- [ ] Using the password grant type
- [ ] Using the authorization code grant type
- [ ] Using the client credentials grant type
- [ ] Using the refresh token grant type
### 14. OAuth2: Implementing the resource server <a name="resource_server"></a>
- [ ] Implementing a resource server 
- [ ] Checking the token remotely 
- [ ] Implementing blackboarding with a JdbcTokenStore
- [ ] A short comparison of approaches 
### 15. OAuth2: Implementing the resource server <a name="using_jwt"></a>
- [ ] Using tokens signed with symmetric keys with JWT
- [ ] Using tokens signed with asymmetric keys with JWT 
- [ ] Adding custom details to the JWT 
### 16. Global method security:Pre- and postauthorizations <a name="global_method_postauthorizations"></a>
- [ ] Enabling global method security 
- [ ] Applying preauthorization for authorities and roles 
- [ ] Applying postauthorization 
- [ ] Implementing permissions for methods 
### 17. Global method security:Pre- and postfiltering <a name="global_method_postfiltering"></a>
- [ ] Applying prefiltering for method authorization
- [ ] Applying postfiltering for method authorization 
- [ ] Using filtering in Spring Data repositories
### 18. Hands-on:An OAuth 2 application <a name="oauth_application"></a>
- [ ] The application scenario
- [ ] Configuring Keycloak as an authorization server 
- [ ] Implementing the resource server 
- [ ] Testing the application
### 19. Spring Security for reactive apps <a name="security_reactive"></a>
- [ ] What are reactive apps? 
- [ ] User management in reactive apps 
- [ ] Configuring authorization rules in reactive apps 
- [ ] Reactive apps and OAuth 2
### 20. Spring Security testing <a name="security_testing"></a>
- [ ] Using mock users for tests
- [ ] Testing with users from a UserDetailsService 
- [ ] Using custom Authentication objects for testing 
- [ ] Testing method security 
- [ ] Testing authentication 
- [ ] Testing CSRF configurations
- [ ] Testing CORS configurations
- [ ] Testing reactive Spring Security implementations
