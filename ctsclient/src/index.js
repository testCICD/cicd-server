import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import registerServiceWorker from './registerServiceWorker';
import CandidatesComponent from "./components/CandidatesComponent/CandidatesComponent";

let candidates = [
  {
    "name": "Buce Wayne",
    "location": "Gotham",
    "recruiter": "Ravi",
    "skills": [
      "java",
      "react"
    ],
    "_links": {
      "self": {
        "href": "http://localhost:8080/candidates/1"
      },
      "candidate": {
        "href": "http://localhost:8080/candidates/1"
      }
    }
  },
  {
    "name": "Peter PArker",
    "location": "New York",
    "recruiter": "Nandan",
    "skills": [
      "java",
      "react"
    ],
    "_links": {
      "self": {
        "href": "http://localhost:8080/candidates/2"
      },
      "candidate": {
        "href": "http://localhost:8080/candidates/2"
      }
    }
  },
  {
    "name": "Super Man",
    "location": "Chicago",
    "recruiter": "Ravi",
    "skills": [
      "java",
      "react"
    ],
    "_links": {
      "self": {
        "href": "http://localhost:8080/candidates/3"
      },
      "candidate": {
        "href": "http://localhost:8080/candidates/3"
      }
    }
  }
];

ReactDOM.render(<CandidatesComponent candidates={candidates}/>, document.getElementById('root'));
registerServiceWorker();
