function check() {
	const userId = document.forms["loginForm"]["userId"].value;
	const userPwd = document.forms["loginForm"]["userPwd"].value;

	if (userId == "" || userId == null) {
		alert("아이디가 빈칸입니다.");
		return false;
	}
	if (userPwd == "" || userPwd == null) {
		alert("비밀번호가 빈칸입니다.");
		return false;
	}


}