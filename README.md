# xtramile-backend

# Getting Started

### 1. Please insert your own database credentials in resources/application.properties
```agsl
spring.datasource.username={your_database_username}
spring.datasource.password={your_database_password}
```

### 2. Build and run the XtramilePatientApplication.java

# Endpoints

## [GET] Patients

url : ```/```

response :

```agsl
{
  "patients": [
    {
      "id": 2,
      "firstName": "Jovi",
      "lastName": "Petra",
      "dateOfBirth": "1997-01-01",
      "gender": "MALE",
      "address": {
        "address": "123 Main St",
        "suburb": "Suburb",
        "state": "Tangerang",
        "postcode": "12345"
      },
      "phoneNumber": "123-456-555"
    },
    {
      "id": 3,
      "firstName": "Abraham",
      "lastName": "Alexander Mannuel",
      "dateOfBirth": "1990-12-01",
      "gender": "MALE",
      "address": {
        "address": "123 Main St",
        "suburb": "BSD",
        "state": "Tangerang",
        "postcode": "150150"
      },
      "phoneNumber": "0896-288-100"
    },
    {
      "id": 6,
      "firstName": "Abraham",
      "lastName": "Alexander",
      "dateOfBirth": "1990-12-01",
      "gender": "MALE",
      "address": {
        "address": "123 Main St",
        "suburb": "BSD",
        "state": "Tangerang",
        "postcode": "150150"
      },
      "phoneNumber": "0896-288-100"
    }
  ],
  "totalPages": 2
}
```
## [GET] One Patient

url : ```/:id```

response :

```agsl
{
      "id": 2,
      "firstName": "Jovi",
      "lastName": "Petra",
      "dateOfBirth": "1997-01-01",
      "gender": "MALE",
      "address": {
        "address": "123 Main St",
        "suburb": "Suburb",
        "state": "Tangerang",
        "postcode": "12345"
      },
      "phoneNumber": "123-456-555"
    }
```

## [POST] One Patient

url : ```/```

request body :
```agsl
{
    "firstName": "Jovi",
    "lastName": "Petra",
    "dateOfBirth": "1997-01-01",
    "gender": "MALE",
    "address": {
      "address": "123 Main St",
      "suburb": "Suburb",
      "state": "Tangerang",
      "postcode": "12345"
    },
    "phoneNumber": "123-456-555"
  }
```

response :

```agsl
{
      "id": 2,
      "firstName": "Jovi",
      "lastName": "Petra",
      "dateOfBirth": "1997-01-01",
      "gender": "MALE",
      "address": {
        "address": "123 Main St",
        "suburb": "Suburb",
        "state": "Tangerang",
        "postcode": "12345"
      },
      "phoneNumber": "123-456-555"
    }
```

## [DELETE] Edit Patient

url : ```/:id```

response : 204 No Content

