import React, { Component, PropTypes } from 'react';
import './CandidatesComponent.css';
import CandidateComponent from '../CandidateComponent/CandidateComponent';

class CandidatesComponent extends Component {

  renderCandidates = () => {
    // let candidatesDOM = [];
    return this.props.candidates.map((candidate) => {
      return <CandidateComponent name={candidate.name}/>
    });
    // return candidatesDOM;
  };

  render() {
    return (
      <div>{this.renderCandidates()}</div>
    );
  }
}

CandidatesComponent.propTypes = {
  candidates: PropTypes.array
};

export default CandidatesComponent;
