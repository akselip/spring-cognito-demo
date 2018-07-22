# spring-cognito-demo

## Summary

Demo application to show how to use spring with Amazon Cognito

## Usage

1. Add correct values to application.yml
2. Send a GET request to /auth/login for redirection to cognito login form
3. Login to cognito and get redirected back with authorization code
4. Use authorization code to get token by sending GET request to /auth/token?code={code}
5. Add 'Authorization' header with value 'Bearer {id_token} to access restricted endpoints.
