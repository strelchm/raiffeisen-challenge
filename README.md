# raiffeisen-challenge
Task 4 boot camp: Socks API.

**Features:**
- [x] Unique word statistics of html-document
- [x] Statistics is saved to DB. History getting posibility
- [x] Posibility of reading big documents - parsing is going througt the input streams
- [x] Integration test covers biggest bug possibility
- [x] Useful exception handling and logging ("logs" folder)

**Technologies:**
- Spring Boot
- Spring Walidation
- Spring Data Jpa
- Heroku
- Project Lombok
- Mapstruct
- PostgreSQL



1. **Local deployment** 

Run the next command from root directory (install Docker before this):
```
sudo docker-compose up
```
An app and db will start. Try to test api through Open API Swagger UI: http://localhost:8082/swagger-ui.html



2. **Try with Heroku**

An app is deployed to Heroku (with Heroku Postgres plugin). Try to test api through Open API Swagger UI: https://raiffeisen-challenge.herokuapp.com/swagger-ui.html
