import React, { Component, PropTypes } from 'react';
import './CandidateComponent.css';

class CandidateComponent extends Component {
  render() {
    return (
      <div className='root'>Candidate Name: {this.props.name}</div>
    );
  }
}

CandidateComponent.propTypes = {
  name: PropTypes.string
};

CandidateComponent.defaultProps = {
  name: 'Dummy'
};

export default CandidateComponent;
