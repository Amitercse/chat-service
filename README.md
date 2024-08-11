![image](https://github.com/user-attachments/assets/920e2590-0d8e-42bb-95a7-74b3fcd0d926)This service demonstrates how we can integrate chat gpt with Java backend service and interact with chat gpt 

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
      "model": 
      "temperature":
      "messages": [
	      {
          "role": "user",
          "content": "Tell me 5 beautiful cities to visit in India"
        }
      ]
    }
  ```

  
