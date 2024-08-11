This service demonstrates how we can integrate chat gpt with Java backend service and interact with chat gpt 

## Project Overview
* This is REST service developed using spring boot that interacts with chat gpt.
* It takes user query as input, parse the info and create REST request for chat gpt.
* Get the response from chat gpt and parse it. Retrieve expected info from chat gpt response. Chat gpt returns response in below format - Choices, message, content etc.
* Extract required response and send it back as response

### Interacting with chat gpt API
* Chat gpt provides API end point - "https://api.openai.com/v1/chat/completions" to ask chat gpt and get response
* First of all need to create account with OpenAI and generate API key for our use
* Purchase some OpenAI credits otherwise OpenAI would return too many requests error for your API call
* Prepare the request for chat gpt. Chat gpt accepts API key as bearer auth in header. Also the request body contains -
  ```
    {
      "model": "gpt-3.5-turbo",
      "temperature": 0.5,
      "messages": [
	      {
          "role": "user",
          "content": "Tell me 5 beautiful cities to visit in India"
        }
      ]
    }
  ```

### Understanding chat gpt request
* Model - model is a program that is trained over a set of data. OpenAI supports multiple models that provides different capabilities and pricing models
* Temperature - control the randomness of the output. Higher the temperature, more random output would be.
* Role - Specific roles to guide the model's response. System, user and assistant are the typical roles
