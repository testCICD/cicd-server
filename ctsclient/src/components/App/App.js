import React, { Component } from 'react';
import './App.css';
import CandidatesComponent from "../CandidatesComponent/CandidatesComponent";
import fetch from "isomorphic-fetch"

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      candidates: []
    };
  }

  componentDidMount() {
    fetch('/api/candidates', {
      method: 'get',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json',
      },
    }).then((response) => {
          if (response.status >= 400) {
            throw new Error("Bad response from server");
          }
          return response.json();
        }).then((responseJson) => {
          if (responseJson.page && responseJson.page.totalElements > 0) {
            this.setState({ candidates: responseJson._embedded.candidates});
          }
      });
  }

  render() {
    return (this.state.candidates ? <div style={{ textAlign: 'center'}}><h3>Candidates List</h3><div className='App'><CandidatesComponent candidates={this.state.candidates}/></div></div> : <div className='App'>Loading Candidates</div>);
  }
}

export default App;
