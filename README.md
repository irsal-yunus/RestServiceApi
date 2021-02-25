# requirement :
- spring web
- jpa
- h2 database

# Running Project :
./mvnw clean spring-boot:run or mvn clean spring-boot:run

# Testing After Running :
curl -v localhost:8080/employees 

# POST
curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'

# PUT
curl -X PUT localhost:8080/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'

# DELETE
curl -X DELETE localhost:8080/employees/3