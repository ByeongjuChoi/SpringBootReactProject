import React, { useEffect, useState } from "react";
import axios from 'axios';

export default function Message() {
	const [message, setMessage] = useState("");
	
	useEffect(() => {
		axios.get("http://localhost:8080/api/message")
			.then(response => {
				setMessage(response.data);
			})
			.catch(error => {
				console.error("Error: ", error);
			});
	}, []);
	
	return (
		<div>
			<h1>{message}</h1>
		</div>
	)
}