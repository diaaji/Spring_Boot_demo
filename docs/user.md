# USER API SPECS

## REGISTER
- endpoint : POST 'api/user/register'

Request body
```json
{
  "username": "string",
  "email": "string",
  "password": "string"
}

```
Response (success)
```json
{
  "status": "success",
  "message": "User registered successfully"
}
```
Response (error)
```json
{
  "status": "error",
  "message": "User already exists",
  
  "status": "error",
  "message": "username is required"
}
```
## LOGIN

- endpoint : POST 'api/auth/login'

Request body
```json
{
  "username": "string",
  "password": "string"
}

```
Response (success)

```json
{
  "status": "success",
  "data": {
    "token": "string",
    "expireAt": "string"
  }
}
```
Response (error)
```json
{
  "status": "error",
  "message": "User is not exist",
  
  "status": "error",
  "message": "username is required",
  
  "status": "error",
  "message": "password is required"
}
```

## GET USER

- endpoint : GET 'api/user/{usernameCurrent}'
  - Request Header
   X_Auth-Token: 'string'(mandatory)

Response body

```json
{
  "data": {
    "username": "string",
    "name": "string"
  }
}
```
Response (error)
```json
{
  "status": "error",
  "message": "unauthorized"
}
```

## UPDATE USER

- endpoint : PATCH 'api/user/{usernameCurrent}/update
  - Request Header
   X_Auth-Token: 'string'(mandatory)

Request body
```json
{
  "username": "string",
  "name": "string", 
  "password": "string",
  "passwordConfirm": "string"
}

```
Response (success)

```json
{
  "status": "success",
  "data": {
    "username": "string",
    "name": "string"
  }
}

```
Response (error)
```json
{
  "status": "error",
  "message": "Username is already taken",
  
  "status": "error",
  "message": "password is cant be same as current password",
  
  "status": "error",
  "message": "password is required",
  
  "status": "error",
  "message": "passwordConfirm must be same as password",}
```
## LOGOUT
- endpoint : DELETE api/auth/logout

    - Request Header
     X_Auth-Token: 'string'(mandatory)
Response (success)
```json
{
  "status": "success",
  "message": "User logged out successfully"
}
```