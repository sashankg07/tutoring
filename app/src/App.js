import React, { useEffect, useState } from 'react';
import logo from './logo.svg';
import './App.css';

const App = () => {
  const [students, setStudents] = useState([]);
  const [loading, setLoading] = useState(false);

  useEffect(() => {
    setLoading(true);

    fetch('/api/login/students')
      .then(response => response.json())
      .then(data => {
        setStudents(data);
        setLoading(false);
      })
      .catch(error => {
        console.error('Error fetching students:', error);
        setLoading(false);
      });
  }, []);

  if (loading) {
    return <p>Loading...</p>;
  }

  return (
    <div className="App">
      <header className="App-header">
        <div className="App-intro">
          <h2>Student List</h2>
          {students.length > 0 ? (
            students.map(student => (
              <div key={student.id}>
                <p>Name: {student.firstName}</p>
                <p>Email: {student.emailId}</p>
              </div>
            ))
          ) : (
            <p>No students found</p>
          )}
        </div>
      </header>
    </div>
  );
}

export default App;
