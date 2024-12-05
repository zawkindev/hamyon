# Add new company
curl -X POST http://localhost:8080/company \
  -H "Content-Type: application/json" \
  -d '{
    "name": "XYZ Bank",
    "address": "123 Elm Street",
    "contact": "123-456-7890",
    "role": "BANK",
    "code": "XYZ123",
    "username": "xyzbank",
    "password": "securepassword"
}'

# Get All Companies
curl -X GET http://localhost:8080/company


