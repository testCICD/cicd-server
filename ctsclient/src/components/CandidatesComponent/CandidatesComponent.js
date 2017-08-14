import React, { Component } from 'react';
import PropTypes from 'prop-types';
import './CandidatesComponent.css';
import CandidateComponent from '../CandidateComponent/CandidateComponent';

class CandidatesComponent extends Component {


  renderCandidates = () => {
    return this.props.candidates.map((candidate) => {
      return <CandidateComponent className='candidate' name={candidate.name}/>
    });
  };

  render() {
    return (
      <div className='candidates'>{this.renderCandidates()}</div>
    );
  }
}

CandidatesComponent.propTypes = {
  candidates: PropTypes.array
};

export default CandidatesComponent;
