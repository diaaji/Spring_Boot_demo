# Address API Specs

## Create Address
- Endpoint : POST 'api/contact/{contactId}/address'
- Request Header
  X_Auth-Token: 'string'(mandatory)

Request Body :
```json 
{
  "addressId": "string",
  "contactId": "string",
  "addressLine1": "string",
  "addressLine2": "string",
  "city": "string",
  "state": "string",
  "postalCode": "string",
  "country": "string"
}
```

Response Body (Success):
```json
{
  "status": "success",
  "data": {
    "addressLine1": "string",
    "addressLine2": "string",
    "city": "string",
    "state": "string",
    "postalCode": "string",
    "country": "string"
  }
}
```

Response Body (Error):
```json
{
  "status": "error",
  "message": "addressLine1 is required"
}
```


## Get Address

- Endpoint : GET 'api/contact/{contactId}/address/{addressId}'
- Request Header
  X_Auth-Token: 'string'(mandatory)

Response Body (Success):
```json
{
  "status": "success",
  "data": {
    "addressId": "string",
    "contactId": "string",
    "addressLine1": "string",
    "addressLine2": "string",
    "city": "string",
    "state": "string",
    "postalCode": "string",
    "country": "string"
  }
}
```

Response Body (Error):
```json
{
  "status": "error",
  "message": "address is not available"
}
```

## Update Address
- Endpoint : PUT 'api/contact/{contactId}/address/update/{addressId}'
- Request Header
  X_Auth-Token: 'string'(mandatory)

Request Body :
```json
{
  "addressId": "string",
  "contactId": "string",
  "addressLine1": "string",
  "addressLine2": "string",
  "city": "string",
  "state": "string",
  "postalCode": "string",
  "country": "string"
}
```

Response Body (Success):

```json
{
  "status": "success",
  "data": {
    "addressLine1": "string",
    "addressLine2": "string",
    "city": "string",
    "state": "string",
    "postalCode": "string",
    "country": "string"
  }
}
```

Response Body (Error):
```json
{
  "status": "error",
  "message": "addressLine1 is required"
}
```

## Delete Address

- Endpoint : DELETE 'api/contact/{contactId}/address/delete/{addressId}'
- Request Header
  X_Auth-Token: 'string'(mandatory)


Response Body (Success):
```json
{
  "status": "success",
  "message": "Address deleted successfully"
}
```

Response Body (Error):
```json
{
  "status": "error",
  "message": "address is not available"
}
```

## List Address
- Endpoint : GET 'api/contact/{contactId}/address'
- Request Header
  X_Auth-Token: 'string'(mandatory)


Response Body (Success):
```json
{
  "status": "success",
  "data": [
    {
      "addressId": "string",
      "contactId": "string",
      "addressLine1": "string",
      "addressLine2": "string",
      "city": "string",
      "state": "string",
      "postalCode": "string",
      "country": "string"
    }
  ]
}
```

Response Body (Error):
```json
{
  "status": "error",
  "message": "address is not available"
}
```