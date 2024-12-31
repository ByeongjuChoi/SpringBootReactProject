import React, { useEffect, useState } from "react";
import axios from 'axios';

export default function Login() {
	const [id, setId] = useState("");
	const [pw, setPw] = useState("");
	const [nickname, setNickName] = useState("");

	// 회원가입 api 호출
    const entryMemner = async () => {
        try {
            const response = await fetch('http://localhost:8080/api/v1/login', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({
                    id: id,
                    pw: pw,
                    nickName: nickname,
                }),
            });
            if (response.ok) {
                console.log('로그인 성공');
                fetchComments(); // 댓글 목록 다시 가져오기
            } else {
                console.error('로그인 실패');
            }
        } catch (error) {
            console.error('Error: ', error);
        }
    };



	return (
		<div>
			<h1>Login Page</h1>
			ID: <input type="text" value={id} onChange={(e) => setId(e.target.value)} />
			PW: <input type="password" value={pw} onChange={(e) => setPw(e.target.value)}/>
			NickName: <input type="text" value={nickname} onChange={(e) => setNickName(e.target.value)}/>
			<button onClick={entryMemner}>회원가입</button>
		</div>
	)
}
