# microservices-learning
1. start EurekaServerApp.
2. start libary, book, student microservice.
3. start API Gateway and try to access all microservices through API Gateway service.




E.g.  Get-> localhost:8084/student/1 ->  using api gatway service(port of api gatway) and getting student details from student service, student service is internally using library service and library service is internally using book service.
