**# RESTful E-Commerce Backend Engine**



**A robust, enterprise-ready REST API backend built using Java and Spring Boot. This application handles data layer state persistence, structured service tiers, and exposes standardized HTTP methods following the REST architecture guidelines.**



**## Tech Stack \& Architecture**

**\* \*\*Language Framework:\*\* Java 17 / Spring Boot**

**\* \*\*Data Layer:\*\* Spring Data JPA / Hibernate**

**\* \*\*Database Engine:\*\* In-Memory H2 Database**

**\* \*\*Build System:\*\* Apache Maven**



**## Project Architecture Blueprint**

**The application follows a strict decoupled multi-tier architectural layout:**

**1. \*\*Controller Layer:\*\* Manages incoming HTTP network packets, request payload deserialization, and maps logical endpoint routes.**

**2. \*\*Service Layer:\*\* Houses modular business computational logic separated cleanly from raw web requests.**

**3. \*\*Repository Data Layer:\*\* Manages underlying SQL infrastructure interactions using object-relational mapping.**



**## API Documentation Map**



**| HTTP Verb | API Endpoint Path | Payload Target Function |**

**| :--- | :--- | :--- |**

**| \*\*GET\*\* | `/api/v1/products` | Retrieve entire catalog array |**

**| \*\*GET\*\* | `/api/v1/products/{id}` | Target specific catalog entity by ID |**

**| \*\*POST\*\* | `/api/v1/products` | Append a new product profile |**

**| \*\*PUT\*\* | `/api/v1/products/{id}` | Modify existing properties on a product |**

**| \*\*DELETE\*\*| `/api/v1/products/{id}` | Strip out a catalog item completely |**



**## Execution Guidelines**

**1. Import into your local Eclipse instance as an \*\*Existing Maven Project\*\*.**

**2. Right-click the root execution driver class containing your main method (`EcommerceApiApplication.java`).**

**3. Select \*\*Run As\*\* -> \*\*Java Application\*\*.**

**4. The web service container initializes dynamically over local interface port `8080`.**



**## Contributor**

**\* \*\*Aditya Sharma\*\* - Lead Software Engineer / System Architect**

