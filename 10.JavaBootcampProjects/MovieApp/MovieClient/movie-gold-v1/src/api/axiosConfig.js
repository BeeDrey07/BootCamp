import axios from 'axios';

const api = axios.create({
    baseURL: "http://localhost:8000", // Adjust the protocol and port as needed
    headers: { "ngrok-skip-browser-warning": "true" }
  });
  
  export default api;