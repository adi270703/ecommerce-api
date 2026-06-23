**# core-commerce-backend**



**Production-ready REST API core built with Spring Boot and Java, exposing data-validated endpoints for inventory management. The system is designed around a strictly decoupled three-tier architecture (Web/Service/Data) to isolate concerns and enforce maintainability.**



**## Architectural Architecture**



**The application implements a standard enterprise layer separation layout:**



**\* \*\*Controller Layer (`com.aditya.ecommerce.controller`)\*\*: Manages incoming REST network payloads, handles serialization boundaries via JSON/Java mappings, and sets safe Cross-Origin Resource Sharing (CORS) rules.**

**\* \*\*Service Layer (`com.aditya.ecommerce.service`)\*\*: Encapsulates core transaction boundaries and internal domain logic operations separate from raw transport contexts.**

**\* \*\*Repository Layer (`com.aditya.ecommerce.repository`)\*\*: Inherits JpaRepository APIs to run structural Object-Relational Mapping (ORM) against the data store infrastructure.**



**## Data Schema \& Entities**



**The relational database layer builds out automatically from the underlying Hibernate entity context:**



**\* `id` (Long, Primary Key, Identity Generation)**

**\* `name` (String)**

**\* `description` (String)**

**\* `price` (Double)**

**\* `stockQuantity` (Integer)**



**## Interface Specifications**



**All routes bind to the `/api/v1/products` base URI context paths.**



**| Verb | Routing Context | Payload Schema | Success Status |**

**| :--- | :--- | :--- | :--- |**

**| `GET` | `/` | None | 200 OK (Array) |**

**| `GET` | `/{id}` | None | 200 OK / 404 Not Found |**

**| `POST` | `/` | JSON (Full Product attributes) | 200 OK (Created Object) |**

**| `PUT` | `/{id}` | JSON (Updated attributes) | 200 OK / 404 Not Found |**

**| `DELETE` | `/{id}` | None | 204 No Content |**



**## Local Execution Environment**



**1. Import the source tree root directly into Eclipse via File -> Import -> Existing Maven Projects.**

**2. The runtime uses an internal configuration layout. The properties file `src/main/resources/application.properties` sets up the H2 engine configuration metrics locally.**

**3. Locate the standard entry driver class (`EcommerceApiApplication.java`) containing the runtime execution hook.**

**4. Execute via \*\*Run As -> Java Application\*\*. The embedded Tomcat stack boots automatically listening over local system interface port `8080`.**



**## Author \& Engineering Ownership**

**\* \*\*Aditya Sharma\*\* — Principal System Developer**

