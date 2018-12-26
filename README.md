# Spring Kotlin Chuck

Playing with Spring Kotlin and MongoDB, consume an API of Chuck Norris and save it to a MongoDB database with Push Notification custom service(fcm firebase).

  - Spring
  - Kotlin
  - Coroutines
  - Rest API
  - MongoDB
  - Push Notifications

# API Path

  - /chuck
  -- GET ---> /joke it returns all jokes[List] stored in MongoDB
  -- POST ---> /joke  it stores a new joke in MongoDB and returns all stored jokes
  -- Get ---> /random it return a random joke from Chuck API
  - /notifications
  -- Get ---> /all it will push a notification to all devices subscribed

