# 🐦 Tweteroo API - Spring Edition 🍃

## 📋 Description

### Tweteroo is a social media app similar to Twitter where users can share their thoughts and opinions to the world. 🌎

## 🚀 Routes

- **POST** `/api/sign-up`
  - Receives (through the request body), a parameter **username** and an **avatar**, containing the user's username and avatar picture:
    ```jsx
    {
      username: "bobesponja",
    	avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info"
    }
    ```
- **POST** `/api/tweets`

  - Receives (through the request body), the parameters `username` and `tweet`:
    ```jsx
    {
      username: "bobesponja",
      tweet: "eu amo o hub"
    }
    ```

- **GET** `/api/tweets`
  - Return the last 10 tweets posted
