import React, { Component } from 'react';
import PropTypes from 'prop-types';
import './CandidateComponent.css';

class CandidateComponent extends Component {
  render() {
    return (
      <div className='root'>{this.props.name}</div>
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
