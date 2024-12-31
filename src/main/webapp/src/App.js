import React from 'react';
import Message from "./SampleTest";
import JoinPage from './JoinPage';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

function App() {
	return (
		<Router>
            <Routes>
                <Route path="/" element={<JoinPage />} />
            </Routes>
        </Router>
	);
}

export default App;