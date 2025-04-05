# Contact API Specs

## Create Contact
Endpoint : POST 'api/contact/create'

- Request Header
  X_Auth-Token: 'string'(mandatory)

Request Body : 
```json
{
  "contactId": "string",
  "FirstName": "string",
  "LastName": "string",
  "email": "string",
  "phone": "string"
}
```

Response Body (Success) :
```json
{
  "status": "success",
  "data": {
    "contactId": "string",
    "FirstName": "string",
    "LastName": "string",
    "email": "string",
    "phone": "string"
  }
}
```

Response Body (Error) :
```json
{
  "status": "error",
  "message": "FirstName is required"
}
```


## Get Contact
Endpoint : GET 'api/contact/{contactId}'

- Request Header
  X_Auth-Token: 'string'(mandatory)

Response Body (Success) :
```json
{
  "status": "success",
  "data": {
    "contactId": "string",
    "FirstName": "string",
    "LastName": "string",
    "email": "string",
    "phone": "string"
  }
}
```

Response Body (Error) :
```json
{
  "status": "error",
  "message": "Contact not found"
}
```

## Update Contact 
Endpoint : PUT 'api/contact/{contactId}/update'

- Request Header
  X_Auth-Token: 'string'(mandatory)

Request Body : 
```json
{
  "contactId": "string",
  "FirstName": "string",
  "LastName": "string",
  "email": "string",
  "phone": "string"
}
```

Response Body (Success) : 
```json
{
  "status": "success",
 "messagae": "Contact updated successfully",
  "data": {
    "contactId": "string",
    "FirstName": "string",
    "LastName": "string",
    "email": "string",
    "phone": "string"
  }
}
```

Response Body (Error) :
```json
{
  "status": "error",
  "message": "FirstName is required"
}
```

## Delete Contact
Endpoint : DELETE 'api/contact/delete/{contactId}'

- Request Header
  X_Auth-Token: 'string'(mandatory)

Response Body (Success) :
```json
{
  "status": "success",
  "message": "Contact deleted successfully"
}
```

Response Body (Error) :
```json
{
  "status": "error",
  "message": "Contact not found"
}
```

##  Search Contact
Endpoint : GET 'api/contact/search'

Query Parameters :
- name : 'string'
- phone : 'string'
- email : 'string'
- page : 'integer'
- pageSize : 'integer'

- Request Header
  X_Auth-Token: 'string'(mandatory)

Response Body (Success) :

```json
{
  "status": "success",
  "data": [
    {
      "contactId": "string",
      "FirstName": "string",
      "LastName": "string",
      "email": "string",
      "phone": "string"
    }
  ],
  "currentPage": 1,
  "totalPage": 10,
  "size" : 10
}
```

Response Body (Error) :
```json
{
  "status": "error",
  "message": "Unauthorized"
}
```
