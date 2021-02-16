#RESTful Web Services

## Consider about a Social Media Application

- Retrieve all users - GEt /users
- Create a user - POST /users
- Retrieve one user - GET /users{id} -> / users/1
- Delete a user - GET /users{id} -> / users/1

- Retrieve all posts for a user - GET /users/{id}/posts
- Create a posts for a User - POST /users/{id}/posts
- Retrieve details of a post - GET /users/{id}/posts/{post_id}

- Who is configuring dispatcher servlet ? -> Spring boot auto configuration
- Who is configuring error mapping ? -> Spring boot auto configuration

## Internationalization
### Configuration
- LocaleResolver
	- Default Locale - Locale.US
-ResourceBundleMessageSource

### Usage
- Autowire MessageSource
- @RequestHeader(value = "Accept-language", required = false) Locale locale
- messageSource.getMessage("helloworld.message", null, locale)

### Swagger
- Swagger is used for providing standard documentation for restful services

### Quick resolving for port 8080 already in use
- In terminal, type lsof -i:8080 to list the process listening to 8080
- The type kill $(lsof -t -i:8080)

### Versioning
- Media type versioning also know as content negotiation or accept header.
	- Github
- Customer headers versioning.
	- Microsoft
- URI versioning.
	- Twitter
- Factors
	- URI Pollution
	- Misuse of HTTP Headers
	- Caching
	- Can we execute request on browser
	- API Documentation
- No perfect solution.