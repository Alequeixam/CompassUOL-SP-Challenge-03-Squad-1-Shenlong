# CompassUOL-SP-Challenge-03-Squad-1-Shenlong

## Installation

1. Clone the repository:

```bash
git clone https://github.com/Alequeixam/CompassUOL-SP-Challenge-03-Squad-1-Shenlong.git
```

2. Install dependencies with Maven

3. Install [PostgresSQL](https://www.postgresql.org/)

## Usage

1. Start the applications with Maven
2. The API Gateway will be accessible at http://localhost:8080


## API Endpoints
The API provides the following endpoints:

```markdown
GET /categories - Retrieve a list of all categories. 

POST /categories - Register a new category.

DELETE /categories/{categoryId} - Delete a category.

GET /products - Retrieve a list of all products. 

POST /products - Register a new product.

DELETE /products/{productId} - Delete a product.

GET /users - Retrieve a list of all users. 

POST /users - Register a new user.

DELETE /users/{userId} - Delete a user.


POST /auth/login - Login into the App

POST /auth/register - Register a new user into the App
```


## Database
The project utilizes [PostgresSQL](https://www.postgresql.org/) as the database.
