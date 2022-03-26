# Spring-MicroService-DailyCodeBuffer
Microservice project
![Microservices Architecture](https://user-images.githubusercontent.com/93706283/141652416-3492c38e-1f7c-4076-8bc2-d37c1957e4a5.PNG)

As per the above Microservices Architecture we have created two services
1) User
2) Department

Created Eureka server as Service-Registry (we can register multiple services in registery) and mention below are the clients.
1) Cloud-Gateway
2) Department-Service
3) User-Service


First Hit will come on Cloud-Gateway and it will pass to Department or User according to the url path are mention in # application.yml 
file.....
