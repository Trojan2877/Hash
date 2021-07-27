# Hash
SHA1 Hash API-Dropwizard

This API uses Dropwizard Framework to hash input using SHA1.

Request Json Looks something like this :

{
  "data" : "Provide_data_to_Hash_here"
}

response gives out the Hash value.

pretty basic stuff here.... meh

Oh yeah,also run :

mvn package

Its buit using maven afterall
and deploy jar onto the server : 

java -jar target\Encrypt-1.0-SNAPSHOT.jar server
