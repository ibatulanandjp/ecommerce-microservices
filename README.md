# Micro Marketplace: An E-commerce Microservices Application

## Solution Overview

Micro Marketplace is a robust e-commerce application built on a microservices architecture using Spring technologies and other open-source tools. 
- This platform leverages the power of **Spring Boot**, **Netflix Eureka**, **Spring Cloud Gateway**, and **KeyCloak** for service development, discovery, gateway management, and security, respectively. 
- It incorporates **Resilience4j** for resilient synchronous communication, and **Apache Kafka** for seamless event-driven asynchronous communication between services.
- It offers extensive observability into the application using **Micrometer** and **Zipkin** for distributed tracing, and **Prometheus** and **Grafana** for monitoring and visualization. 

With a focus on scalability, resilience, and real-time interaction, Micro Marketplace provides a robust foundation for creating feature-rich online marketplaces.


### Solution Architecture
![Solution Architecture](docs/images/architecture/SolutionArchitecture.png)

### Services
- **Product Service:** Responsible for managing product information, including creation, retrieval, and updates. It uses a MongoDB database.
- **Order Service:** Handles order management, including creating and retrieving orders. It uses a MySQL database.
- **Inventory Service:** Manages products inventory. It also uses a MySQL database.
- **Notification Service:** A stateless service responsible for sending notifications to users regarding their orders or other relevant updates.

### Major Components
- **Discovery Server:** Netflix Eureka is employed for service registration and discovery, allowing microservices to locate and interact with each other dynamically.
- **API Gateway:** Spring Cloud Gateway is deployed to serve as the entry point for all external requests, effectively routing traffic to the appropriate microservices.
- **Auth Server:** For robust authentication and authorization mechanisms, KeyCloak is used to secure the microservices and protect sensitive data.
- **Circuit Breaker:** Resilience4j is used to maintain system reliability by preventing cascading failures in microservices through circuit-breaking mechanisms.
- **Message Broker:** Apache Kafka forms the backbone of Micro Marketplace's event-driven architecture, facilitating asynchronous notification for orders.
- **Observability Stack:** Distributed tracing is implemented to monitor and troubleshoot requests as they traverse different microservices, using Micrometer for metrics and Zipkin for tracing. 
   Moreover, Prometheus is used for collecting metrics, and Grafana for providing a rich dashboard for visualizing and analyzing application performance data.

### Tech Stack Used
<div>
    <table>
        <tr>
            <td>
                <strong>Languages & Frameworks</strong>
            </td>
            <td>
                <a href="ttps://www.java.com/en/">
                    <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://spring.io/projects/spring-boot" target="_blank">
                    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-6DB33F?style=flat&logo=springboot&logoColor=white">
                </a>
                &emsp;
                <a href="https://spring.io/projects/spring-cloud" target="_blank">
                    <img alt="Spring Cloud" src="https://img.shields.io/badge/Spring Cloud-6DB33F?style=flat&logo=spring&logoColor=white">
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Databases & Message Queue</strong>
            </td>
            <td>
                <a href="https://mongodb.io/" target="_blank"> 
                    <img alt="MongoDB" src="https://img.shields.io/badge/MongoDB-4EA94B?style=flat&logo=mongodb&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://mysql.com/" target="_blank"> 
                    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-00000F?style=flat&logo=mysql&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://kafka.apache.org/" target="_blank"> 
                    <img alt="Apache Kafka" src="https://img.shields.io/badge/Apache%20Kafka-000?style=flat&logo=apachekafka"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>API Gateway</strong>
            </td>
            <td>
                <a href="https://spring.io/projects/spring-cloud-gateway" target="_blank"> 
                    <img alt="Spring Cloud Gateway" src="https://img.shields.io/badge/Spring Cloud Gateway-6DB33F.svg?&style=flat&logo=spring&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Service Discovery</strong>
            </td>
            <td>
                <a href="https://spring.io/projects/spring-cloud-netflix" target="_blank"> 
                    <img alt="Netflix Eureka" src="https://img.shields.io/badge/Eureka-DF162B.svg?&style=flat&logo=netflix&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Circuit Breaker</strong>
            </td>
            <td>
                <a href="https://resilience4j.readme.io/" target="_blank"> 
                    <img alt="Resilience4J" src="https://img.shields.io/badge/Resilience4J-121212.svg?&style=flat&logo=resilience4j&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Security</strong>
            </td>
            <td>
                <a href="https://www.keycloak.org/" target="_blank"> 
                    <img alt="KeyCloak" src="https://img.shields.io/badge/KeyCloak-00B8E3.svg?&style=flat&logo=keycloak&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Observability</strong>
            </td>
            <td>
                <a href="https://micrometer.io/" target="_blank"> 
                    <img alt="Micrometer" src="https://img.shields.io/badge/Micrometer-117A71.svg?&style=flat&logo=micrometer&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://zipkin.io/" target="_blank"> 
                    <img alt="Zipkin" src="https://img.shields.io/badge/Zipkin-FE7139.svg?&style=flat&logo=zipkin&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://prometheus.io/" target="_blank"> 
                    <img alt="Prometheus" src="https://img.shields.io/badge/Prometheus-E6522C.svg?&style=flat&logo=prometheus&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://grafana.com/" target="_blank"> 
                    <img alt="Grafana" src="https://img.shields.io/badge/Grafana-F79A2F.svg?&style=flat&logo=grafana&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
        <tr>
            <td>
                <strong>Build & Containerization</strong>
            </td>
            <td>
                <a href="https://maven.apache.org/" target="_blank"> 
                    <img alt="Maven" src="https://img.shields.io/badge/Maven-C02748?style=flat&logo=apachemaven&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://www.docker.com/" target="_blank"> 
                    <img alt="Docker" src="https://img.shields.io/badge/Docker-2496ED?style=flat&logo=docker&logoColor=white"/>
                </a>
                &emsp;
                <a href="https://github.com/GoogleContainerTools/jib" target="_blank"> 
                    <img alt="Jib" src="https://img.shields.io/badge/Jib-FF6444?style=flat&logo=googlecloud&logoColor=white"/>
                </a>
                &emsp;
            </td>
        </tr>
    </table>
</div>

