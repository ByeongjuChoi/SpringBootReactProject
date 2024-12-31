import React from 'react';
import Message from "./SampleTest";
import Login from './Login';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

function App() {
	return (
		<Router>
            <Routes>
                <Route path="/" element={<Login />} />
            </Routes>
        </Router>
	);
}

export default App;